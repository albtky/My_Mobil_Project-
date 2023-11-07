import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a;
        int toplam=0;

        while (true) {
            toplam = 0;
            a = input.nextInt();
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    toplam += i;
                }

            }
            String sonuc = (toplam + a == 2 * a) ?
                    "Girilen sayı PERFECT" :
                    "maalesef NOT PERFECT";
            System.out.println(sonuc);
        }







    }
}