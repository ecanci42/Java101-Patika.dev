import java.util.Scanner;

public class china_Zodyak
{
    public static void main(String[] args)
    {
        int year, res;
        Scanner input = new Scanner(System.in);

        System.out.printf("Doğum Yılınızı girin: ");
        year = input.nextInt();

        res = year % 12;

        switch (res)
        {
            case 0:
                System.out.printf("Çin Zodyağı Burcunuz: Maymun");
                break;
            case 1:
                System.out.printf("Çin Zodyağı Burcunuz: Horoz");
                break;
            case 2:
                System.out.printf("Çin Zodyağı Burcunuz: Köpek");
                break;
            case 3:
                System.out.printf("Çin Zodyağı Burcunuz: Domuz");
                break;
            case 4:
                System.out.printf("Çin Zodyağı Burcunuz: Fare");
                break;
            case 5:
                System.out.printf("Çin Zodyağı Burcunuz: Öküz");
                break;
            case 6:
                System.out.printf("Çin Zodyağı Burcunuz: Kaplan");
                break;
            case 7:
                System.out.printf("Çin Zodyağı Burcunuz: Tavşan");
                break;
            case 8:
                System.out.printf("Çin Zodyağı Burcunuz: Ejderha");
                break;
            case 9:
                System.out.printf("Çin Zodyağı Burcunuz: Yılan");
                break;
            case 10:
                System.out.printf("Çin Zodyağı Burcunuz: At");
                break;
            case 11:
                System.out.printf("Çin Zodyağı Burcunuz: Koyun");
                break;
        }
    }
}
