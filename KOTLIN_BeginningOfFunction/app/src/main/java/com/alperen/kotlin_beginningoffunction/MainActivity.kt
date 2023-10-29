package com.alperen.kotlin_beginningoffunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setOnliyClick METHOTUNU KULLANMA ŞEKLİ **********************
        var btn = findViewById<View>(R.id.button2)
        btn.setOnClickListener{
            var d = findViewById<TextView>(R.id.result)
            d.text="SONUC: ${ikincininyanı(40,50)}"
        }

    }

    fun ikincininyanı(a:Int, b:Int ):Int {
        return a+b

    }
    /*fun degıstır(view : View){
        var d = findViewById<TextView>(R.id.result)
        d.text="SONUC: ${ikincininyanı(40,50)}"
    }*/

}