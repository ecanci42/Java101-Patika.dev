import java.util.Scanner;

public class Kombinasyon
{
    public static void main(String[] args)
    {
        int n, r, i, ext, komb, nfak = 1, rfak = 1, cfak = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n değeri girin: ");
        n = inp.nextInt();
        System.out.print("r değeri girin: ");
        r = inp.nextInt();
        ext = n - r;
        for (i = 1; i <= n; i++)
            nfak = nfak * i;
        for (i = 1; i < r; i++)
            rfak = rfak * i;
        for (i = 1; i < ext; i++)
            cfak = cfak * i;
        komb = nfak / (rfak * cfak);
        System.out.println("kombinasyon: " + komb);
    }
}
