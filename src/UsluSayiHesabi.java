import java.util.Scanner;

public class UsluSayiHesabi {
    public static void main(String[] args) {
        int taban, kuvvet, sonuc = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz: ");
        taban = input.nextInt();

        System.out.print("Kuvvetin Değerini Giriniz: ");
        kuvvet = input.nextInt();

        for (int i = 1; i <= kuvvet; i++)
        {
            sonuc *= taban;
        }
        System.out.println(sonuc);
    }
}
