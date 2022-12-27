import java.util.Scanner;

public class RecursiveUsSayiHesabi {
    public static void main(String[] args) {
        int number, exp;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Girin: ");
        number = input.nextInt();
        System.out.print("Üssü Girin: ");
        exp = input.nextInt();
        System.out.print("Sonuç: "+ Power(number, exp));
    }
    public static int Power(int base, int exp){
        if (exp <= 0)
            return 1;
        return base * Power(base, exp - 1);
    }
}
