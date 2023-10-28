package com.alperen.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

        fun degıstır(view : View ){
             var name = findViewById<TextView>(R.id.textView)
            name.text="Tamamdır sg sonraki videoya geç"



        }





    }
}