
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik>25){
            System.out.println("YüzmeYapmalısın");
        }
        if (sicaklik>15 && sicaklik <25){
            System.out.println("Piknik yapmalısın");
        }
        if (sicaklik>5 && sicaklik <15){
            System.out.println("Sinemaya gitmelisin");
        }
        if (sicaklik<5){
            System.out.println("Kayak yapmalısın");
        }
    }
}
