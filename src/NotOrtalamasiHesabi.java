import java.util.Scanner;
public class NotOrtalamasiHesabi
{
    public static void main(String[] args)
    {
                int matNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu;
                Scanner scan = new Scanner(System.in);

                System.out.print("Matematik  notunuzu giriniz : ");
                matNotu = scan.nextInt();
                System.out.print("Fizik dersi notunuzu giriniz : ");
                fizikNotu = scan.nextInt();
                System.out.print("Kimya dersi notunuzu giriniz : ");
                kimyaNotu = scan.nextInt();
                System.out.print("Türkce dersi notunuzu giriniz : ");
                turkceNotu = scan.nextInt();
                System.out.print("Tarih dersi notunuzu giriniz : ");
                tarihNotu = scan.nextInt();
                System.out.print("Müzik dersi notunuzu giriniz : ");
                muzikNotu = scan.nextInt();
                int toplam = matNotu + muzikNotu + fizikNotu + kimyaNotu + tarihNotu + turkceNotu;
                double ortalama = toplam / 6;
                System.out.println( ortalama > 60 ? "Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
