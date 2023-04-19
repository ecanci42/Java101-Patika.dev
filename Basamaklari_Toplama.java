import java.util.Scanner;

public class Basamaklari_Toplama
{
    public static void main(String[] args)
    {
        int n, count = 0; int result = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Bir sayı girin: ");
        n = input.nextInt();

        while (n != 0)
        {
            count++;
            int k = n;

            k = (n % 10);
            n /= 10;

            result = k + result;
        }

        System.out.println(result);
    }
}
