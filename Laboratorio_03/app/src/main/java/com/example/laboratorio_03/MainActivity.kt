package com.example.laboratorio_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.nio.file.Files.find

class MainActivity : AppCompatActivity() {

    private lateinit var five: ImageView
    private lateinit var ten: ImageView
    private lateinit var twentyFive: ImageView
    private lateinit var one_d: ImageView
    private lateinit var Cvalue: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        find()
        addMoney()

    }

    private fun MonedaPrecionada(digito:Double){
        Cvalue.text = "$digito"


    private fun find(){
        five = findViewById(R.id.five_cent)
        ten = findViewById(R.id.ten_cent)
        twentyFive = findViewById(R.id.quarter)
        one_d = findViewById(R.id.one_dollar)
        Cvalue = findViewById(R.id.Money_acount)
    }

    private fun addMoney(){

        five.setOnClickListener {

            MonedaPrecionada( 0.05 )
        }
        ten.setOnClickListener {
            MonedaPrecionada(0.10)
        }
        twentyFive.setOnClickListener {
            MonedaPrecionada(0.25)
        }
        one_d.setOnClickListener {
            MonedaPrecionada(1.00)
        }

    }
}