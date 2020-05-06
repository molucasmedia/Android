package com.molucasmedia.ambontoday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        buttonlogin.setOnClickListener{
            startActivity(Intent (this, HomeActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }

        Link_signUp.setOnClickListener{
            startActivity(Intent (this, SignUpActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}
