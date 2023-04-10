import java.util.Scanner;

public class Hesap_Makinesi
{
    public static void main(String[] args)
    {
        int a, b, select;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı girin: ");
        a = input.nextInt();

        System.out.print("2. Sayıyı girin: ");
        b = input.nextInt();

        System.out.println("Toplama işlemi için: 1 \nÇıkarma işlemi için: 2 \nÇarpma işlemi için: 3 \nBölme işlemi için: 4 \nMod almak için: 5");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçin: ");
        select = input.nextInt();

        switch (select)
        {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b != 0)
                {
                    System.out.println(a / b);
                }else
                {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin!");
        }

    }
}
