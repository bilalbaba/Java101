import java.util.Scanner;

public class UcgenAlaniHesabi
{
    public static void main(String[] args) {
        int a, b; double c;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Dik Kenari Giriniz: ");
        a = scan.nextInt();
        System.out.print("2. Dik Kenari Giriniz: ");
        b = scan.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        double u = (a+b+c)/2;
        System.out.println("Hipotenüs Değeri: "+ c);
        System.out.println("Dik Ücgenin Çevresi "+ (a+b+c));
        double alan = u*(u-a)*(u-b)*(u-c);

        double alan2 = Math.sqrt(alan);
        System.out.println("Ücgenin Alani = "+alan2);

    }
}
