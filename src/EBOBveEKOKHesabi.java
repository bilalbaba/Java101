import java.util.Scanner;

public class EBOBveEKOKHesabi {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, n3, n4, ekok;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();
        n3 = n1;

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();
        n4 = n2;

        while (n1 != n2)
        {
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("EBOB " + n1);


        ekok = (n3>n4) ? n3:n4;
        while(true)
        {
            if (ekok % n3==0 && ekok % n4 == 0)
            {
                System.out.printf("EKOK: " +ekok);
                break;
            }
            ++ekok;
        }
    }
}
