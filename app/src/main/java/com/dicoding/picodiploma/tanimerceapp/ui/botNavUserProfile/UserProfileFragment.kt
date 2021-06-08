package com.dicoding.picodiploma.tanimerceapp.ui.botNavUserProfile

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.ui.editProfile.EditProfileActivity
import com.dicoding.picodiploma.tanimerceapp.data.ProfileEntity
import com.dicoding.picodiploma.tanimerceapp.ui.introWelcome.WelcomeActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_user_profile.*
import java.io.ByteArrayOutputStream


@Suppress("DEPRECATION")
class UserProfileFragment : Fragment() {

    companion object {
        const val REQUEST_CAMERA = 100
    }
    private lateinit var auth: FirebaseAuth
    private lateinit var imageUri: Uri

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            // Read from the database
            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("${FirebaseAuth.getInstance().currentUser?.uid}")
            myRef.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val value = dataSnapshot.getValue(ProfileEntity::class.java)
                    tv_name.text = value?.nama
                    tv_username.text = value?.username
                    tv_phone.text = value?.phone
                    tv_address.text = value?.address
                }
                override fun onCancelled(error: DatabaseError) {
                }
            })

            auth = FirebaseAuth.getInstance()
            val user = auth.currentUser
            if (user != null) {
                if (user.photoUrl != null) {
                    Picasso.get().load(user.photoUrl).into(img_profile_picture)
                } else {
                    Picasso.get().load(R.drawable.ic_profile_picture).into(img_profile_picture)
                }
                tv_email.text = user.email
                if (user.isEmailVerified) {
                    ic_verified_email.visibility = View.VISIBLE
                } else {
                    ic_unverified_email.visibility = View.VISIBLE
                }

            }

            btn_edit_profile.setOnClickListener {
                Intent(activity, EditProfileActivity::class.java).also {
                    startActivity(it)
                }
            }

            btn_logout.setOnClickListener {
                auth.signOut()
                Intent(activity, WelcomeActivity::class.java).also {
                    it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    requireActivity().startActivity(it)
                }
            }

            ic_unverified_email.setOnClickListener {
                user?.sendEmailVerification()?.addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(activity, "Email verifikasi telah dikirim, silahkan cek email untuk memverifikasi", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(activity, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            btn_profile_picture.setOnClickListener {
                intentCamera()
            }
        }
    }

    private fun intentCamera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { intent ->
            intent.resolveActivity(requireActivity().packageManager).also {
                startActivityForResult(intent, REQUEST_CAMERA)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CAMERA && resultCode == RESULT_OK) {
            val imgBitmap = data?.extras?.get("data") as Bitmap
            uploadImage(imgBitmap)
        }
    }

    private fun uploadImage(imgBitmap: Bitmap) {
        val baos = ByteArrayOutputStream()
        val ref =
            FirebaseStorage.getInstance().reference.child("img/${FirebaseAuth.getInstance().currentUser?.uid}")

        imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos)
        val image = baos.toByteArray()

        ref.putBytes(image).addOnCompleteListener {
            if (it.isSuccessful) {
                ref.downloadUrl.addOnCompleteListener {
                    it.result?.let {
                        imageUri = it
                        img_profile_picture.setImageBitmap(imgBitmap)
                    }
                }
            }
        }
    }

}