package com.alperen.ui_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun CreateCharacter(view: View)
    {
        var show = findViewById<TextView>(R.id.ShowSkills)

        var name = findViewById<TextView>(R.id.NameText)
        var age = findViewById<TextView>(R.id.AgeText)
        var job = findViewById<TextView>(R.id.JobText)

        var isim = name.text.toString()
        var yas = age.text.toString().toIntOrNull()
        var meslek= job.text.toString()

            if (yas  == null )3
        {
            show.text="Doğru yaşı giriniz"
        }
        else
        {
            val superkahramans = CSuperkahraman(isim, yas!!, meslek)
            show.text= "Karakterin Özellikleri: \n isim : ${superkahramans.isim}\n yaş : ${superkahramans.yas}\n meslek : ${superkahramans.meslek}"
        }



    }
}