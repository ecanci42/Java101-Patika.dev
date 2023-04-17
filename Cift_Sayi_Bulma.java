import java.util.Scanner;

public class Cift_Sayi_Bulma
{
    public static void main(String[] args)
    {
        int x, c = 0, count = 0, result;
        Scanner input = new Scanner(System.in);

        System.out.printf("Lütfen Bir Sayı Girin: ");
        x = input.nextInt();

        //Bu loop çift sayıları yazdırır.
        for (int i=1; i<=x; i++)
        {
            if (i % 2 == 0)
                System.out.println(i);
        }

        //Bu loop 3 ve 4'e tam bölünen sayıları belirler.
        for (int i=1; i<=x; i++)
        {
            if (i % 3 == 0 || i % 4 == 0)
            {
                c += i;
                count++;
            }
        }

        result = c / count;

        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + result);

    }
}
