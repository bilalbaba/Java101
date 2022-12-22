import java.util.Scanner;

public class BasamakDegerlerininToplami {
    public static void main(String[] args) {
        Scanner deger  = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı değer giriniz : ");

        int sayi = deger.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi = sayi/10;
        }
        System.out.println("Girilen sayının basamak değerleri toplamı "+toplam);
    }
}
