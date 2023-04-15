import java.util.Scanner;

public class Ucak_Bileti_Fiyat_Hesaplayici
{
    public static void main(String[] args)
    {
        int km, age, type;
        double result, typeRes, endRes, ageRes, endPlease;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.printf("Kaç KM yolculuk yapılacak: ");
        km = input.nextInt();

        System.out.printf("Yaşınız: ");
        age = input.nextInt();

        System.out.printf("1 -> Tek yön \n2 -> Gidiş/Dönüş \nLütfen yolculuk tipini belirtin: ");
        type = input.nextInt();

        if (km > 0 && age > 0 && age < 130 && type == 1 || type == 2)
        {
            if (age < 12)
            {
                switch (type)
                {
                    case 1:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        System.out.println("%50 Yaş İndirimi Uygulanıyor.");
                        System.out.println("İndirimli Tutar: " + result/2);
                        break;
                    case 2:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        typeRes = (result * 20) / 100; // %20lik indirim Hesaplanıyor.
                        endRes = (result/2) - typeRes; // Hesaplanan indirim tutardan düşülüyor.
                        System.out.println("%50 Yaş İndirimi Uygulanıyor.");
                        System.out.println("%20 Gidiş/Dönüş İndirimi Uygulanıyor.");
                        System.out.println("İndirimli Tutar: " + endRes);
                        break;

                }

            } else if (age >= 12 && age <= 24)
            {
                switch (type)
                {
                    case 1:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        ageRes = (result * 10) / 100; // %10'luk yaş indirimi hesaplanıyor.
                        endRes = result - ageRes; // Hesaplanan indirim düşülüyor.
                        System.out.println("%10 Yaş İndirimi Uygulanıyor.");
                        System.out.println("İndirimli Tutar: " + endRes);
                        break;
                    case 2:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        ageRes = (result * 10) / 100; // %10'luk yaş indirimi hesaplanıyor.
                        endRes = result - ageRes; // Yaş indirimi düşülüyor.
                        typeRes = (endRes * 20) / 100; // %20'lik tip indirimi hesaplanıyor.
                        endPlease = endRes - typeRes; // Tip indirimi düşüyor.
                        System.out.println("%10 Yaş İndirimi Uygulanıyor.");
                        System.out.println("%20 Gidiş/Dönüş İndirimi Uygulanıyor.");
                        System.out.println("İndirimli Tutar: " + endPlease);
                        break;
                }
            } else if (age > 65)
            {
                switch (type)
                {
                    case 1:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        ageRes = (result * 30) / 100; // %30'luk yaş indirimi hesaplanıyor.
                        endRes = result - ageRes; // Hesaplanan indirim düşülüyor.
                        System.out.println("%30 Yaş İndirimi Uygulanıyor.");
                        System.out.println("İndirimli Tutar: " + endRes);
                        break;
                    case 2:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        ageRes = (result * 30) / 100; // %30'luk yaş indirimi hesaplanıyor.
                        endRes = result - ageRes; // Yaş indirimi düşülüyor.
                        typeRes = (endRes * 20) / 100; // %20'lik tip indirimi hesaplanıyor.
                        endPlease = endRes - typeRes; // Tip indirimi düşüyor.
                        System.out.println("%30 Yaş İndirimi Uygulanıyor.");
                        System.out.println("%20 Gidiş/Dönüş İndirimi Uygulanıyor.");
                        System.out.println("İndirimli Tutar: " + endPlease);
                        break;
                }
            } else
            {
                switch (type)
                {
                    case 1:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        break;
                    case 2:
                        result = km * 0.10;
                        System.out.println("Belirlenen Tutar: " + result);
                        typeRes = (result * 20) / 100; // %20'lik tip indirimi hesaplanıyor.
                        endPlease = result - typeRes; // Tip indirimi düşüyor.
                        System.out.println("%20 Gidiş/Dönüş İndirimi Uygulanıyor.");
                        System.out.println("İndirimli Tutar: " + endPlease);
                        break;
                }
            }
        }else
        {
            isError = true;
        }

        if (isError)
        {
            System.out.printf("Eksik ya da hatalı veri girdiniz, lütfen tekrar deneyin!");
        }
    }
}
