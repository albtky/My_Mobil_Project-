import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");

        int toplam;
        int n;

        while (true) {
            toplam = 0;
            int m = input.nextInt();
            for (int i = 1; i < m; i++) {
                if (m % i == 0)
                    toplam += i;
            }
            System.out.println("BİRİNCİ SAYININ BÖL. TOPL." + toplam );
            n = toplam;
            int toplam2;

            toplam2 = 0;
            for (int k = 1; k < n; k++) {
                if (n % k == 0) {
                    toplam2 += k;
                }
            }
            System.out.println("İKİNCİ SAYININ BÖL. TOPL." + toplam2 );

            String sonuc = (toplam2 == m) ? "Girilen sayı  ile $n sayısı arkadaş sayılardır." : "Girilen sayı tam bir YIKIK üzgünüm.";
            System.out.println("Girilen " + n + " ve " + m + "sayısı GARDAŞ sayılardır.");


        }

    }
}