import java.util.Scanner;

public class VucutKitleIndeksiHesabi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy = giris.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo = giris.nextInt();
        System.out.println("Vücut kitle indeksiniz " + (kilo / (boy * boy)));
    }
}
