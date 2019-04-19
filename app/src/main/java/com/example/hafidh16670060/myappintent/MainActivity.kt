package com.example.hafidh16670060.myappintent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_profil.setOnClickListener{
            val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }
        btn_ktkteman.setOnClickListener{
            val intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }

        btn_insta.setOnClickListener({
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/hafidhnafi/?hl=en"))
            startActivity(browserIntent)
        })

    }
}

