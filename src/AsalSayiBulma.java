import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("2-100 arasında bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 2; i < n; i++){
            boolean flag = true;

            for (int j = 2; j < i; j++){
                if ( i % j == 0){
                    flag = false;
                }
            }
            if (flag)
                System.out.print(i + " ");
        }
    }
}

