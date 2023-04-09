import java.util.Scanner;

public class Vucut_kitle_index
{
    public static void main(String[] args)
    {
        double boy, kilo, indeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu girin: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu girin: ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz: " + indeks);
    }
}
