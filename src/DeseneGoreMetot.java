import java.util.Scanner;

public class DeseneGoreMetot {
    static void desen(int number, int result, int tempNumber) {
        if(tempNumber <= 0) {
            System.out.print(result + " ");
            result += 5;
            if(result == number) {
                System.out.print(result + " ");
                return;
            }
        }else if(tempNumber > 0) {
            System.out.print(result + " ");
            result -= 5;
            if (result <= 0) {
                tempNumber = result;
            }
        }
        desen(number,result,tempNumber);
    }

    public static void main(String[] args) {
        int number, result, tempNumber;
        Scanner sc = new Scanner(System.in);

        System.out.print("N sayısı : ");
        number = sc.nextInt();

        result = number;
        tempNumber = number;

        if(number == 0) {
            System.out.println("0 kullanılmaz.");
        }else {
            desen(number,result,tempNumber);
        }
    }
}
