import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int maks = 0, min = 0, temp, sayi;
        System.out.print("Kaç adet sayı gireceksniz ? ");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++){
            System.out.print(i+" . sayıyı giriniz ");
            temp = giris.nextInt();

            if ( i== 1)
            {
                min = temp;
                maks = temp;
            }

            if ( temp < min)
                min = temp;
            if (temp > maks)
                maks = temp;
        }
        System.out.println("girelen sayıların en küçüğü "+min);
        System.out.println("girilen sayıların en büyüğü "+maks);
    }
}
