package com.example.calculatorapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvNIM = findViewById<TextView>(R.id.tvNIM)
        val tvName = findViewById<TextView>(R.id.tvName)

        val result = intent.getDoubleExtra("result", 0.0)
        val nim = intent.getStringExtra("nim")
        val name = intent.getStringExtra("name")

        tvResult.text = "Hasilnya adalah: $result"
        tvNIM.text = "NIM: $nim"
        tvName.text = "Nama: $name"
    }
}
