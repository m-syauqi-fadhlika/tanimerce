package com.dicoding.picodiploma.tanimerceapp.ui.botNavMarket

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.ui.maps.MapActivity
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import kotlinx.android.synthetic.main.fragment_market.*


class MarketFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_market, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity?.let {
                ContextCompat.checkSelfPermission(
                    it,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            } == PackageManager.PERMISSION_GRANTED
        ) {
            startActivity(Intent(activity, MapActivity::class.java))
            return
        }

        btn_grant.setOnClickListener {
            Dexter.withActivity(activity)
                .withPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                .withListener(object : PermissionListener {
                    override fun onPermissionGranted(response: PermissionGrantedResponse?) {
                        startActivity(Intent(activity, MapActivity::class.java))
                    }

                    override fun onPermissionDenied(response: PermissionDeniedResponse) {
                        if (response.isPermanentlyDenied) {
                            val builder = AlertDialog.Builder(context!!)
                            builder.setTitle("Permission Denied")
                                .setMessage("Permission to access device location is permanently denied. you need to go to setting to allow the permission.")
                                .setNegativeButton("Cancel", null)
                                .setPositiveButton(
                                    "OK"
                                ) { dialog, which ->
                                    val intent = Intent()
                                    intent.action =
                                        Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                                    intent.data =
                                        Uri.fromParts("package", "com.dicoding.picodiploma.tanimerceapp", null)
                                }
                                .show()
                        } else {
                            Toast.makeText(
                                context,
                                "Permission Denied",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                    override fun onPermissionRationaleShouldBeShown(
                        permission: PermissionRequest?,
                        token: PermissionToken
                    ) {
                        token.continuePermissionRequest()
                    }
                })
                .check()
        }
    }
}