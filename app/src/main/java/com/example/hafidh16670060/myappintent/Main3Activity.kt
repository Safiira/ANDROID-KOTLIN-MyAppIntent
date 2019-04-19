package com.example.hafidh16670060.myappintent

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn_hubanggita.setOnClickListener {
            val phoneNumber = "082326366206"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubarif.setOnClickListener {
            val phoneNumber = "085879509438"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubayu.setOnClickListener {
            val phoneNumber = "089505729206"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubfanani.setOnClickListener {
            val phoneNumber = "08983897082"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubfebta.setOnClickListener {
            val phoneNumber = "082133243369"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubfirman.setOnClickListener {
            val phoneNumber = "081225737057"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubheni.setOnClickListener {
            val phoneNumber = "085875660001"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubheny.setOnClickListener {
            val phoneNumber = "085546397022"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubira.setOnClickListener {
            val phoneNumber = "085740487367"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubizzul.setOnClickListener {
            val phoneNumber = "0895361236154"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubnevian.setOnClickListener {
            val phoneNumber = "085227608684"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubnisa.setOnClickListener {
            val phoneNumber = "082242878227"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubnisrina.setOnClickListener {
            val phoneNumber = "085700881955"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubrofhiq.setOnClickListener {
            val phoneNumber = "082214641499"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubsinta.setOnClickListener {
            val phoneNumber = "08893328485"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubslamet.setOnClickListener {
            val phoneNumber = "081548684869"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_hubsyaikhul.setOnClickListener {
            val phoneNumber = "089688382815"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }


    }
}
