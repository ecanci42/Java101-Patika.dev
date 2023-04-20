import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0, b = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi için bir sayı girin: ");
        int n = input.nextInt();

        System.out.print("Fibonacci serisi: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
