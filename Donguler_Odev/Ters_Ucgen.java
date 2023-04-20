import java.util.Scanner;

public class Ters_Ucgen
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin: ");
        int n = input.nextInt();

        for (int i = n; i >=0  ; i--)
        {
            for (int j = (n - i); j >0 ; j--)
                System.out.print(" ");

            for (int k = (2 * i + 1); k >=1 ; k--)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
