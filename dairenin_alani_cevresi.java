import java.util.Scanner;

public class dairenin_alani_cevresi
{
    public static void main(String[] args)
    {
        int r;
        double pi = 3.14, alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
