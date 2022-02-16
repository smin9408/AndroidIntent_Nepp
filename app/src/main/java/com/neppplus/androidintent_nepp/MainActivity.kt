package com.neppplus.androidintent_nepp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {

            val inputPhoneNum = edtPhoneNum.text.toString()

//            Intent에 어디로 전화를 걸지 알려줘야함. Uri를  이용해서 알려주자.
            val myUri = Uri.parse("tel:${inputPhoneNum}") // 유의사항 : 띄어쓰기는 끼면 안됨.

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)

        }
    }
}