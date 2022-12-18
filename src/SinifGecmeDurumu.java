import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int notToplami = 0, dersSayisi = 0;
        int matematik,fizik,turkce,kimya,muzik;

        System.out.println("Matematik Notunuz: ");
        matematik = input.nextInt();
        if (matematik < 0 || matematik > 100){
            System.out.println("Bu Not Hesaplamaya dahil edilmeyecektir!");
        }else{
            notToplami += matematik;
            dersSayisi++;
        }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100){
            System.out.println("Bu Not Hesaplamaya Dahil Edilmeyecektir!");
        }else {
            notToplami += fizik;
            dersSayisi++;
        }

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce> 100){
            System.out.println("Bu Not Hesaplamaya dahil edilmeyecektir!");
        }else{
            notToplami += turkce;
            dersSayisi++;
        }

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100){
            System.out.println("Bu Not Hesaplamaya Dahil Edilmeyecektir!");
        }else {
            notToplami += kimya;
            dersSayisi++;
        }

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100){
            System.out.println("Bu Not Hesaplamaya Dahil Edilmeyecektir!");
        }else {
            notToplami += muzik;
            dersSayisi++;
        }

        double ortalama = notToplami / dersSayisi;
        if (ortalama < 55) {
            System.out.println("Kaldınız !");
        }else{
            System.out.println("Geçtiniz Tebrikler !");
        }

        System.out.println("Ortalamanız : "+ortalama);
    }
}
