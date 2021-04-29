package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewString = findViewById<TextView>(R.id.textViewString)
        val textViewInt = findViewById<TextView>(R.id.textViewInt)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener() {
            val data = TestClass()
            textViewString.setText(data.stringField)
            textViewInt.setText(data.intField.toString())
        }


    }
}
