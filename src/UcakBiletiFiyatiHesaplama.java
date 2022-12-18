import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double kmBasinaMaliyet = 0.10, gidipDonus = 0.20;
        double yasIndirimOrani;
        double normalUcreti, yasIndirimi, indirimliTutar, sonFiyat;

        boolean isRun = true;

        while(isRun){
            System.out.print("Mesafeyi Km türünden giriniz : ");
            mesafe = input.nextInt();

            System.out.print("Yaşınızı Giriniz : ");
            yas = input.nextInt();

            System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
            yolculukTipi = input.nextInt();

            if((yolculukTipi == 1 || yolculukTipi ==2) && (yas > 0 && mesafe > 0)){
                if(yas < 12 ) yasIndirimOrani = 0.50;
                else if (yas <=24 ) yasIndirimOrani = 0.10;
                else if( yas >=65 ) yasIndirimOrani = 0.30;
                else yasIndirimOrani = 0;

                normalUcreti = mesafe * kmBasinaMaliyet;
                yasIndirimi = normalUcreti * yasIndirimOrani;
                indirimliTutar = normalUcreti - yasIndirimi;
                sonFiyat = indirimliTutar;

                if(yolculukTipi == 2){
                    double twoWayDiscount = indirimliTutar * gidipDonus;
                    sonFiyat = (indirimliTutar - twoWayDiscount) * 2;
                }
                System.out.println("Toplam Tutar = "+sonFiyat + " TL");
                isRun = false;
            }else System.out.println("Hatalı veri girdiniz \n");
        }
    }
}
