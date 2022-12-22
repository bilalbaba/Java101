import java.util.Scanner;

public class UcDorteBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int goalNumber, kacAdet = 0, sayiToplam = 0;
        double avgNumber;
        System.out.print("Bir sayı giriniz: ");
        goalNumber = input.nextInt();

        for (int i = 1; i <= goalNumber; i++)
        {
            if (i%3==0 && i%4==0){
                System.out.println("Her ikisine de bölünebilen sayı: " + i);
                sayiToplam += i;
                kacAdet++;
            }
        }
        avgNumber=sayiToplam/kacAdet;
        System.out.println(goalNumber + " e/a kadar + 3 ve 4'e tam bölünen sayıların ortalamasını: " + avgNumber);
        input.close();
    }
}
