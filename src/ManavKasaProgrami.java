import java.util.Scanner;

public class ManavKasaProgrami
{
    public static void main(String[] args)
    {
        double armutFiyati = 2.14, elmaFiyati = 3.67, domatesFiyati = 1.11, muzFiyati = 0.95, patlicanFiyati = 5.00;
        double kacKiloArmut, kacKiloElma, kacKiloDomates, kacKiloMuz, kacKiloPatlican;
                Scanner  input = new Scanner(System.in);
                System.out.print("Armut Kaç Kilo ? :");
                kacKiloArmut = input.nextInt();
                System.out.print("Elma Kaç Kilo ? :");
                kacKiloElma = input.nextInt();
                System.out.print("Domates Kaç Kilo ? :");
                kacKiloDomates = input.nextInt();
                System.out.print("Muz Kaç Kilo ? :");
                kacKiloMuz = input.nextInt();
                System.out.print("Patlıcan Kaç Kilo ? :");
                kacKiloPatlican = input.nextInt();

                double toplamTutar = armutFiyati * kacKiloArmut + elmaFiyati * kacKiloElma + domatesFiyati * kacKiloDomates
                        + muzFiyati * kacKiloMuz + patlicanFiyati * kacKiloPatlican;
                System.out.println("Toplam Tutar: "+ toplamTutar + " TL");
    }
}
