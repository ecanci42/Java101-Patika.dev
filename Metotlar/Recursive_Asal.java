import java.util.Scanner;

public class Recursive_Asal
{
    static boolean isPrime(int num)
    {
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.printf("Lütfen Bir Sayı Girin: ");
            num = input.nextInt();

            if (isPrime(num))
                System.out.println("Girdiğiniz sayı asal bir sayıdır");
            else
                System.out.println("Girdiğiniz sayı asal değildir");
        } while (num != -1);

    }
}
