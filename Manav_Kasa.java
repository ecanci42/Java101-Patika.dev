import java.util.Scanner;

public class Manav_Kasa
{
    public static void main(String[] args)
    {
        double armut, elma, domates, muz, patlican, kg, toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        armut = input.nextDouble();

        System.out.print("Elma kaç kilo: ");
        elma = input.nextDouble();

        System.out.print("Domates kaç kilo: ");
        domates = input.nextDouble();

        System.out.print("Muz kaç kilo: ");
        muz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo: ");
        patlican = input.nextDouble();

        toplam = (2.14 * armut) + (3.67 * elma) + (1.11 * domates) + (0.95 * muz) + (5.00 * patlican);

        System.out.println("Toplam Tutar: " + toplam);
    }
}
