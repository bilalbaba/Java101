import java.util.Scanner;
public class KdvTutariHesabi
{
    public static void main(String[]args)
    {
        double fiyat,kdvlifiyat,kdvtutari;
        Scanner girisVerisi = new Scanner(System.in);
        System.out.print("KDVsiz Fiyatı Giriniz: ");
        fiyat = girisVerisi.nextInt();
        if (fiyat < 1000)
            System.out.println("KDV'li fiyat "+(fiyat+0.18*fiyat)+"  ve KDV tutarı  "+0.18*fiyat + " TL'dir.");
        else
            System.out.println("KDV'li fiyat "+(fiyat+0.08*fiyat)+"  ve KDV tutarı  "+0.08*fiyat + " TL'dir.");
    }
}
