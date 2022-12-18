import java.util.Scanner;
public class KullaniciGirisi {
    public static void main (String[]args){
        String newPassword, password = "java123";
        String kullaniciGiris, sifreGiris; int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Şifrenizi Giriniz:");
        sifreGiris = input.nextLine();

        if (sifreGiris.equals(password)){
            System.out.println("Sisteme başarılı bir şekilde giriş yaptınız");
        }
        else{
            System.out.println("Şifre hatalı\nŞifreyi sıfırlamak için 1'e çıkış için 2'ye basınız");
            secim = input.nextInt();
            switch (secim)
            {
                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    input.nextLine();
                    newPassword = input.nextLine();
                    while (newPassword.equals(password)){
                        System.out.print("Şifre oluşturulamadı!!\n lütfen başka şifre giriniz: ");
                        newPassword = input.nextLine();
                    }
                    System.out.println("Yeni şifre oluşturuldu. Yeni şifreniz. "+ newPassword);
                    break;
                case 2:
                    System.out.println("Sistemden çıkış işlemi gerçekleştirildi");
                    break;
                default:
            }
        }
    }
}
