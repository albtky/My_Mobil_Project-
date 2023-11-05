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

        var btn = findViewById<View>(R.id.button2)



        var at = animals()
        at.ayakSayısı=4
        at.tür="memeli"
        at.beslenme = "otobur"
        // setOnliyClick METHOTUNU KULLANMA ŞEKLİ **********************
        // ÜSTTE btn değişkeni View türüyle oluşturulduktan sonra hemen alttaki gib setOnClickListener yolunu kullanabiliriz

        btn.setOnClickListener{
            var d = findViewById<TextView>(R.id.result)
            d.text="Hayvanın bilgileri : " +
                    "ayak sayısı : ${at.ayakSayısı}\ntürü : ${at.tür}\nBeslenme şekli: ${at.beslenme}"
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