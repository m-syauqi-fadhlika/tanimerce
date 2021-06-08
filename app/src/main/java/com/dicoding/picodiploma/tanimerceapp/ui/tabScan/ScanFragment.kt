package com.dicoding.picodiploma.tanimerceapp.ui.tabScan


import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dicoding.picodiploma.tanimerceapp.R
import kotlinx.android.synthetic.main.fragment_scan_fruit.*

@Suppress("DEPRECATION")
class ScanFruitFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_fruit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        ImageClassifier.init(getAssets(), "converted_model.tflite")

        b_select_from_cam.setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { intent ->
                intent.resolveActivity(requireActivity().packageManager).also {
                    startActivityForResult(intent, 0)
                }
            }
        }
        b_select_from_gal.setOnClickListener {
            val pickPhoto = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(pickPhoto, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            0 -> if (resultCode == Activity.RESULT_OK) {
                val bitmap = data?.extras?.get("data") as Bitmap?
                startActivity(
                    Intent(activity, ResultActivity::class.java).putExtra(
                        "image-bitmap",
                        bitmap
                    )
                )
            }
            1 -> if (resultCode == Activity.RESULT_OK) {
                val imageUri = data!!.data
                startActivity(
                    Intent(activity, ResultActivity::class.java).putExtra(
                        "image-uri",
                        imageUri
                    )
                )
            }
        }
    }
}
