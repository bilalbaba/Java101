import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void modding() {
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        double sonuc = 1;

        System.out.print("Mod Alınacak sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("Mod sayısını giriniz: ");
        sayi2 = scan.nextInt();

        sonuc = sayi1 % sayi2;

        System.out.println("Sonuç: "+sonuc);
    }

    static void recPerArea()
    {
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        double sonuc = 1, alan, cevre;

        System.out.print("Kısa Kenar Uzunluğunu : ");
        sayi1=scan.nextInt();
        System.out.print("Uzun Kenar Uzunluğunu : ");
        sayi2=scan.nextInt();

        alan=sayi1*sayi2;
        cevre=2*(sayi1+sayi2);
        System.out.println("---------");
        System.out.println("Dikdörtgenin Çevresinin Değeri: "+cevre);
        System.out.println("---------");
        System.out.println("Dikdörgenin Alan Değeri: "+alan);
        System.out.println("---------");
    }
    public static void main(String[] args) {

    }
}
