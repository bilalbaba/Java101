import java.util.Scanner;

public class DaireDilimiAlaniHesabi
{
    public static void main(String[] args) {
        int r, alfa; double daireAlan, PI_DEGERI = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
        alfa = inp.nextInt();
        daireAlan = PI_DEGERI * r * r * alfa / 360;
        System.out.println("Dairenin Diliminin Alanı: " + daireAlan);
    }
}
