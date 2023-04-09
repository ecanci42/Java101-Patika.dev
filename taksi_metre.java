import java.util.Scanner;

public class taksi_metre
{
    public static void main(String[] args)
    {
        double km = 2.20, gidilenKm = 0, tutar;
        int acilisUcreti = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Toplam gidilen KM'yi girin: ");
        gidilenKm = input.nextDouble();

        tutar = km*gidilenKm+acilisUcreti;

        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Toplam ücret: " + tutar);
    }
}
