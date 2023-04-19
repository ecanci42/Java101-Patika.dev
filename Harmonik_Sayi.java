import java.util.Scanner;

public class Harmonik_Sayi
{
    public static void main(String[] args)
    {
        int n;
        double result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.printf("N sayısını girin: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++)
            result += (1/i);
        System.out.print(result);
    }
}
