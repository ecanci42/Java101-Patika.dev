import java.util.Scanner;

public class Kuvvet_Bulma
{
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        n= input.nextInt();
        for(int i=1; i<n; i*=4)
            System.out.println("dördün kuvvetleri " +i);

        for(int j=1; j<n; j*=5)
            System.out.println("beşin kuvvetleri " +j);
    }
}
