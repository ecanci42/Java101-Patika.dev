import java.util.Scanner;

public class kdv_hesaplama
{
    public static void main(String[] args)
    {
        double fiyat, kdvOrani, kdvTutari, toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("KDV tutarını hesaplamak istediğiniz ürün fiyatını girin: ");
        fiyat = input.nextDouble();

        if (fiyat > 0 && fiyat <= 1000)
        {
            kdvOrani = 18;
        } else if (fiyat > 1000)
        {
            kdvOrani = 8;
        } else
        {
            System.out.println("Hatalı giriş! Fiyat 1'dan küçük olamaz.");
            return;
        }

        kdvTutari = (fiyat * kdvOrani) / 100;
        toplam = fiyat + kdvTutari;

        System.out.println("KDV'siz fiyat: " + fiyat);
        System.out.println("KDV oranı: %" + kdvOrani);
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyat: " + toplam);
    }
}