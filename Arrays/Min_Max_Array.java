import java.util.Scanner;
import java.util.Arrays;

public class Min_Max_Array
{
    public static void main(String[] args)
    {
        int [] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        int minClosed = 0;
        int maxClosed = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Değer giriniz: ");
        int value = sc.nextInt();

        for (int i : list)
        {
            if (i < value && i > minClosed)
                minClosed = i;
        }

        for (int i : list)
        {
            if (i > value)
            {
                maxClosed = i;
                break;
            }
        }

        System.out.println("En yakın minimum değer: " + minClosed);
        System.out.println("En yakın maksimum değer: " + maxClosed);
    }
}
