import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner Users= new Scanner(System.in);
        int[] dizi = new int[5];
        for (int i = 0;i < dizi.length;i++)
        {
            dizi[i] = random.nextInt(100);
        }
        while (true)
        {
            System.out.println("Tahmininizi giriniz");
            int user= Users.nextInt();
            for (int a = 0; a < dizi.length;a++)
            {
                if (user != dizi[a])
                {
                    System.out.println("Girilen sayı dizinin içinde bulunmamakta maalesef siktir git. ");
                    break;
                }
            }
            System.out.println("diziniz");
            for (int numbers:dizi)
            {
                System.out.print(numbers+" ");
            }
        }

    }
}