package com.robles.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var name: TextView
    private lateinit var email: TextView
    private lateinit var phone: TextView
    private lateinit var btns: Button

    private lateinit var inpname: EditText
    private lateinit var inpemail: EditText
    private lateinit var inpphone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        send()

    }
    private fun send(){
        name = findViewById(R.id.text_name)
        email = findViewById(R.id.text_email)
        phone = findViewById(R.id.text_phone)

        inpname = findViewById(R.id.name)
        inpemail = findViewById(R.id.email)
        inpphone = findViewById(R.id.phone)

        btns.setOnClickListener{
            setContentView(R.layout.second_activity)

        }

    }

}

