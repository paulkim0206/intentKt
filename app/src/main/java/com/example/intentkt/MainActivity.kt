package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_a)

        btn.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            val msg = findViewById<TextView>(R.id.tv_sendMsg)
            intent.putExtra("msg", msg.text.toString())
            startActivity(intent)
        }
    }
}