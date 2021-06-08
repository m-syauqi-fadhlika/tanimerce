package com.dicoding.picodiploma.tanimerceapp.ui.introWelcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.ui.home.MainActivity
import com.dicoding.picodiploma.tanimerceapp.ui.introLogin.LoginActivity
import com.dicoding.picodiploma.tanimerceapp.ui.introRegister.RegisterActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_welcome)

        auth = FirebaseAuth.getInstance()

        btn_login.setOnClickListener {
            Intent(this@WelcomeActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        btn_register.setOnClickListener {
            Intent(this@WelcomeActivity, RegisterActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    override fun onStart() { //kalo user sudah login langsung ke main
        super.onStart()
        if (auth.currentUser != null) {
            Intent(this@WelcomeActivity, MainActivity::class.java).also { intent ->
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }
        }
    }
}