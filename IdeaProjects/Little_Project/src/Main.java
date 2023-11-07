import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1'e ve kendisine bölünebilen 1'den büyük doğal sayı olması laızm
        Scanner input = new Scanner(System.in);
        int a;
        while  (true)
        {
            a = input.nextInt();
            if(a==1) {
                System.out.println("Asal sayılar 1'den büyüktür");
                break;
            }
            if (a > 1) {
                    if (a % a == 0 && a%1==0 ) {
                        System.out.println("Sayı asaldır.");
                } else
                    System.out.println("Girilen sayı asal değil.");
            } else
                System.out.println("Girilen sayı doğal sayı değildir.");
        }




    }
}