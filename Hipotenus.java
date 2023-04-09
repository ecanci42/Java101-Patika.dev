import java.util.Scanner;

public class Hipotenus
{
    public static void main(String[] args)
    {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı girin: ");
        a = input.nextInt();

        System.out.print("2. Kenarı girin: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs: " + c);
    }
}
