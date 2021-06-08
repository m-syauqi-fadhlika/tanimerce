package com.dicoding.picodiploma.tanimerceapp.ui.editProfile

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.data.ProfileEntity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_edit_profile.*


class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) //tombol back yang di kiri atas

        btn_save.setOnClickListener {
            val name = et_nama.text.toString().trim()
            val username = tv_username.text.toString().trim()
            val phone = tv_phone.text.toString().trim()
            val address = tv_address.text.toString().trim()

            val profile = ProfileEntity(name, username, phone, address)

            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("${FirebaseAuth.getInstance().currentUser?.uid}")
            myRef.setValue(profile).addOnCompleteListener {
                Toast.makeText(applicationContext, "Data disave", Toast.LENGTH_SHORT).show()
            }
        }
    }
}