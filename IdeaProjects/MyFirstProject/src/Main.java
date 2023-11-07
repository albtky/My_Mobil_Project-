import java.sql.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*String[] deneme = new String[3];
        double[] mylist= {1,2,3,4,5};
        for (double number: mylist)
        {

        }*/

        String mesaj = "merhaba";
        int a = mesaj.length();
        int length= 0 ;

        // getchars fonksiyonu; oluşturlan herhangi bir array'e, belirli bir
        // stringteki istenilen indeksler arasındaki değerleri içine atar.
        char[] Char = new char[5];


        mesaj.getChars(0,5,Char,0);

        System.out.println("Yeni array'e atılan karakterler şunlardır : ");
        for (char Chars:Char)
        {
            System.out.println(Chars+ ", ");
        }
        // indexof girilen değerin stringin hangi indexinde ol
        System.out.println("istenilen değerin index değeri : "+ mesaj.indexOf("er"));







    }
}