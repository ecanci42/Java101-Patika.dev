import java.util.Scanner;

public class Max_Min_Value
{
    public static void main(String[] args)
    {
        int n, i = 0, count = 1;
        Scanner input = new Scanner(System.in);

        System.out.printf("Kaç adet sayı gireceksiniz: ");
        n = input.nextInt();
        int[] myArray = new int[n];

        // bu loop kullanıcıdan alınacak değerleri integer array'e atar.
        while (i < n)
        {
            System.out.printf(count+". sayıyı girin: ");
            myArray[i] = input.nextInt();
            i++;
            count++;
        }

        int x = myArray.length;

        // bu loop array'i sıralamak için bubblesort kullanır.
        for (int j = 0; j < x-1; j++)
        {
            for (int k = 0; k < x - j - 1; k++)
            {
                if (myArray[k] > myArray[k + 1])
                {
                    int temp = myArray[k];
                    myArray[k] = myArray[k+1];
                    myArray[k+1] = temp;
                }
            }
        }

        // sıralanmış array'in en sonunda ki sayı en büyük, 0. indeksindeki sayı ise en küçüktür.
        System.out.println("En büyük sayı: " + myArray[n-1]);
        System.out.println("En küçük sayı: " + myArray[0]);

        /*
        Aşağıda daha basit bir örnek verilmiştir.

        int n ;
        int number;
        int min = 0;
        int max = 0;

        Scanner sca = new Scanner(System.in);
        System.out.printf("Kaç adet sayı gireceksiniz: ");
        n = sca.nextInt();

        for (int i = 1; i<= n; i++)
        {
            System.out.println( i + ". sayıyı girin");
            number = sca.nextInt();

            if (number > max)
                max = number;
            if (number < min || min == 0)
                min = number;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " +min);
         */

    }
}
