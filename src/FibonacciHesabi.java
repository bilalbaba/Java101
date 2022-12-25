import java.util.Scanner;

public class FibonacciHesabi {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaçıncı elemana kadar olsun : ");
        n = input.nextInt();

        int sonuc = 0, sayi1, sayi2 = 1;
        for (int i = 0; i < n; i++){
            sayi1 = sayi2;
            sayi2 = sonuc;
            sonuc = sayi1 + sayi2;
            System.out.print(sonuc+" ");
        }
    }
}
