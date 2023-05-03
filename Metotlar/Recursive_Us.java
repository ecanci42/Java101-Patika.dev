import java.util.Scanner;

public class Recursive_Us
{
    static int base(int n, int k)
    {
        int total = 1;

        for (int i = 1; i <= k; i++)
            total *= n;

        return total;
    }

    public static void main(String[] args)
    {
        int n, k;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü hesaplanacak sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();

        System.out.println(base(n, k));
    }
}
