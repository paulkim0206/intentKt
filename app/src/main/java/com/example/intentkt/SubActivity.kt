package com.example.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val getMsg = findViewById<TextView>(R.id.tv_getMsg)

        if (intent.hasExtra("msg")) {
            getMsg.text = intent.getStringExtra("msg")
        }
    }
}