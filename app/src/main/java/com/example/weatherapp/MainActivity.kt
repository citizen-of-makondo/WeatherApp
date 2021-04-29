package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import android.widget.Button
import android.widget.TextView
import java.util.logging.Level.INFO

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

        val array = arrayOf(1, 2, 3, 4, 5)

        for (i in array.iterator()) {
            println(i)
        }

        array.forEach {
            println("Loop from forEach $it")
        }

        for (i in array) {
            println("Easy loop $i")
        }

    }
}
