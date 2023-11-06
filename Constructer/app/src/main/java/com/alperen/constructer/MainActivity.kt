package com.alperen.constructer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superman = SuperKahramanlar()
        var yazdır = findViewById<TextView>(R.id.yazi)
        yazdır.text= "yaş: ${superman.yas}"
        /* NULL GÜVENLİĞİ */
        nullGuvenligi()


    }
    fun nullGuvenligi(){
        // Null, Nullabilit (Null olabilmek), Null safety
        // 1
        var benim:String?

        benim = "alperen"
        var yas: Int
        // NULL SAFETY
        if(benim!=null)
        {
            //BLABLABLABLAB
        }
        else
        {
            //BLABALBLABL
        }

        //2
        // !! -> Null olmayacak, ? -> Null olabilir
        yas = 20
        println(yas!!.minus(2))

        // 3 Elvis opeartörü
        val sonuc = yas?.minus(2)?:10
        // eğer ? nin solundaki yer null ise sag tarafı al değilse eğer sol tarafı al

        // 4 let
        yas?.let {
            println(it*5)

        }
    }
}