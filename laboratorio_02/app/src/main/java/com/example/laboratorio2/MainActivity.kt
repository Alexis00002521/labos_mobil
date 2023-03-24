package com.example.laboratorio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var weigh = findViewById<EditText>(R.id.heightET)
        var heigh = findViewById<EditText>(R.id.weightET)


        CalculateBTN.setOnClickLIstener{
            var messageToShow = .text.toSring()
            message.Text="saludar a $messageToShow"

        }

    }
}