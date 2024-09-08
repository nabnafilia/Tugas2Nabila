package com.example.calculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val rgOperation = findViewById<RadioGroup>(R.id.rgOperation)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()

            if (num1 == null || num2 == null) {
                Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedOperation = rgOperation.checkedRadioButtonId
            val result = when (selectedOperation) {
                R.id.rbAdd -> num1 + num2
                R.id.rbSubtract -> num1 - num2
                R.id.rbMultiply -> num1 * num2
                R.id.rbDivide -> num1 / num2
                else -> 0.0
            }

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("result", result)
            intent.putExtra("nim", "225150401111024")
            intent.putExtra("name", "Nabila Nafilia Dyanti")
            startActivity(intent)
        }
    }
}
