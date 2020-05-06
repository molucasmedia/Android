package com.molucasmedia.ambontoday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_start.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_start)

        button_start1.setOnClickListener{
            finish()
                    startActivity(Intent (this, SigninActivity::class.java))
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }
    }
}

