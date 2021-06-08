package com.dicoding.picodiploma.tanimerceapp.ui.introLogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.ui.home.MainActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.tv_email
import kotlinx.android.synthetic.main.activity_login.et_password

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        btn_login.setOnClickListener {

            val email = tv_email.text.toString().trim()
            val password = et_password.text.toString().trim()

            if (email.isEmpty()) {
                tv_email.error = "Email harus diisi"
                tv_email.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tv_email.error = "Email tidak valid"
                tv_email.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty() || password.length < 6) {
                et_password.error = "Password harus lebih dari 6 karakter"
                tv_email.requestFocus()
                return@setOnClickListener
            }

            loginUser(email, password)
        }


    }

    private fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Intent(this@LoginActivity, MainActivity::class.java).also { intent ->
                        intent.flags =
                            Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(intent)
                    }
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }

    override fun onStart() { //kalo user sudah login langsung ke main
        super.onStart()
        if (auth.currentUser != null) {
            Intent(this@LoginActivity, MainActivity::class.java).also { intent ->
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }
        }
    }
}