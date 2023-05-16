import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Sorting
{
    public static void main(String[] args)
    {
        int len, x = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Dizinin Boyutunu Girin: ");
        len = input.nextInt();

        int[] list = new int[len];

        for (int i = 0; i < len; i++)
        {
            System.out.print(x + ". Elemanı Girin: ");
            list[i] = input.nextInt();
            x++;
        }

        Arrays.sort(list);
        String listString = Arrays.toString(list);
        System.out.print("Dizi: " + listString);
    }
}
