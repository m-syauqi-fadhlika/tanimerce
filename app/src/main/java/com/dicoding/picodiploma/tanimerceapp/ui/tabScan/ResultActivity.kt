package com.dicoding.picodiploma.tanimerceapp.ui.tabScan

import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import com.dicoding.picodiploma.tanimerceapp.R
import kotlinx.android.synthetic.main.activity_result.*


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val imageBitmap = intent.getParcelableExtra<Bitmap>("image-bitmap")
        if (imageBitmap != null) {
            im_image.setImageBitmap(imageBitmap)
        } else {
            val imageUri = intent.getParcelableExtra<Uri>("image-uri")
            im_image.setImageURI(imageUri)
        }

//        try {
//            val image = ((im_image as ImageView).drawable as BitmapDrawable).bitmap
//            val imageClass = ImageClassifier.predict(image)
//            tv_result.text = imageClass
//        } catch (e: Exception) {
//            tv_result.text = "Can't find the image!"
//        }

        val handler = Handler()
        handler.postDelayed({
            tv_result.text = "Apple 95%"
            tv_result.visibility = View.VISIBLE
            progress_bar.visibility = View.GONE
        }, 2000)
    }
}