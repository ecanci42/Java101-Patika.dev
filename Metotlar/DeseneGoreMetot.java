import java.util.Scanner;

public class DeseneGoreMetot
{
    static void result(int n)
    {
        int res = n;

        while (res >= -4)
        {
            System.out.print(res+" ");
            res -= 5;
            if (res <= 0)
            {
                while (res <= n)
                {
                    System.out.print(res+" ");
                    res += 5;
                }
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.printf("Lütfen Bir N Değeri Girin: ");
        n = input.nextInt();

        result(n);
    }
}
