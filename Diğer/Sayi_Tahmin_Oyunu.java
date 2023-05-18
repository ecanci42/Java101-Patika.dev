import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sayi_Tahmin_Oyunu
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5)
        {
            System.out.print("Lütfen Tahmininizi Giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99)
            {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz...");
                if (isWrong)
                {
                    System.out.println("Çok fazla hatalı giriş yaptınız. \nKalan hakkınız: " + (5 - (++right)));
                }else
                {
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yaptığınızda 1 hakkınız düşülecektir!");
                }
                continue;
            }

            if (selected == number)
            {
                System.out.printf("Tebrikler, doğru tahmin!\nTahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            }else
            {
                System.out.println("Hatalı bir Sayı girdiniz!");
                if (selected > number)
                {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                }else
                {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkın: " + (5 - right));
            }

        }

        if (!isWin)
        {
            System.out.println("Kaybettiniz!");
            if (!isWrong)
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }

    }
}
