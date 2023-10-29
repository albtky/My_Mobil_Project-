package com.alperen.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Koleksiyonlar
        //DİZİLER
        val benimDizim = arrayOf("aooa","asdad","asdasdff")
        println(benimDizim)
        println("")
        println(benimDizim.get(0))
        println(benimDizim.set(0,"alperen"))

        println("--------")
        val mylist= arrayListOf<Any>("alperen","osman","leyla","devam ","hadi abi","asdasd")
        println(mylist)
        mylist.add("mecnun")
        println(mylist)
        mylist.add(6,"nerepla")
        println(mylist)
        // 6. indexe mecnun eklendi. Daha sonra 6. index yerine nerepla atandıktan sonra mecnunu bir ileri indexe attı !!!


        // SET Koleksiyon türü
        /*
        SET koleksiyon türü: içine gönderilen değerlerin aynı olanını bir olarak sayıyıor
        yani aynı değişkenden birden fazla varsa onu bir olarak sayıyıor ve bu sayede
        kaç farklı değişken olduğu anlaşılabiliyor.
         */

        val dizim = arrayOf(1,2,3,4,5,6,7,8)
        println("2. index: ${dizim[2]}")
        println("3. index: ${dizim[3]}")

        val benimset=setOf<Int>(1,2,3,4,6,7,8,8)
        println(benimset.size)
        //foreach
        benimset.forEach{
            println(it)
        }
        println("----------------------------- hashset -------------------------")

        val dıgerset= HashSet<String>()
        dıgerset.add("alperen")
        dıgerset.add("alperen")
        dıgerset.add("alperen")
        dıgerset.add("Tokay")
        dıgerset.forEach{
            println(it)
        }

        // Anahtar Kelime - Değer (Key-Value Pairing)
        val yemekkaloriMap= hashMapOf<String, Int>()
        yemekkaloriMap.put("elma",100)
        yemekkaloriMap.put("et",300)
        yemekkaloriMap.put("tavuk",200)

        println(yemekkaloriMap.get("et"))
        println(" ")

        val benimmapim=HashMap<String,String>()
        benimmapim.put("örnek", "Değer")

        val yenimap= hashMapOf<String,Int>("alperen" to 40,"tokay" to 50)
        println(yenimap.get("alperen"))

        println("-------------When - Switch-------------")
        var notrakam = 0
        var notstring= ""

        when(notrakam)
        {
            0 -> notstring="geçersiz not "
            1 -> notstring="zayıf"
            2 -> notstring="kötü"
            3 -> notstring="orta"
            4 -> notstring="iyi"
            else -> notstring = "pekiyi "
        }
        println(notstring)

        println("----------- DÖNGÜLER-----------")
        // FOR
        val benimdizim= arrayOf(1,2,3,3,4,5,6,7,8)
        //her bir eleman 5'e bölünüp 3 eklenecek
        for (item in benimdizim)
        {
            println("$item sayısı için: " + (item+3))
        }

        //WHİLE


















    }
        //fun degıstır(view : View ){
            // var name = findViewById<TextView>(R.id.textView)
          //  name.text="Ahmet Efe Tosun"
        //}
}