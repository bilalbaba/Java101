import java.util.Scanner;

public class RecursivePrimeNumber {

    static boolean isPrimeNumber(int sayi, int i){

        if (sayi <= 2)
            return (sayi == 2) ? true: false;
        if (sayi % i == 0)
            return false;
        if (i * i > sayi)
            return true;
        return isPrimeNumber(sayi,i+1);
    }


    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        if (isPrimeNumber(sayi,2))
            System.out.println(sayi+" sayısı ASALDIR");
        else
            System.out.println(sayi+" sayısı ASAL DEĞİLDİR");
    }
}
