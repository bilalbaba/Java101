import java.util.Scanner;
public class NotOrtalamasiHesabi
{
    public static void main(String[] args)
    {
                int matNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu;
                Scanner scan = new Scanner(System.in);

                System.out.print("Matematik  notunuzu giriniz : ");
                maNotu = scan.nextInt();
                System.out.print("Fizik notunuzu giriniz : ");
                fizikNotu = scan.nextInt();
                System.out.print("Kimya notunuzu giriniz : ");
                kimyaNotu = scan.nextInt();
                System.out.print("Türkce notunuzu giriniz : ");
                turkceNotu = scan.nextInt();
                System.out.print("Tarih notunuzu giriniz : ");
                tarihNotu = scan.nextInt();
                System.out.print("Müzik notunuzu giriniz : ");
                muzikNotu = scan.nextInt();
                int toplam = matNotu + muzikNotu + fizikNotu + kimyaNotu + tarihNotu + turkceNotu;
                double ortalama = toplam / 6;
                System.out.println( ortalama > 60 ? "Sınıfı Geçti":"Sınfta Kaldı");
    }
}
