package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_main)

        btn.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            val msg = findViewById<TextView>(R.id.tv_sendMsg)
            intent.putExtra("msg", msg.text.toString())
            startActivity(intent)
            finish() // 자기 자신 액티비티를 파괴한다
        }

        findViewById<Button>(R.id.btn_toast).setOnClickListener {
            findViewById<ImageView>(R.id.iv_profile).setImageResource(R.drawable.android2) // 이미지뷰에 새로운 이미지 등록
            Toast.makeText(this, "Clicked!!", Toast.LENGTH_SHORT).show()
        }
    }
}