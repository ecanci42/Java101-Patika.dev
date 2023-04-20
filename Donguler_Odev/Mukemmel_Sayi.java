import java.util.Scanner;

public class Mukemmel_Sayi
{
    public static void main(String[] args)
    {
        int num,check=0;
        Scanner input =new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        num=input.nextInt();

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
                check += i;
        }

        if(check==num)
            System.out.println(num+" Mükemmel sayıdır.");
        else
            System.out.println(num+" Mükemmel sayı değildir.");
    }
}
