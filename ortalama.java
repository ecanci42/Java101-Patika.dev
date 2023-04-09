import java.util.Scanner;

public class ortalama
{
    public static void main(String[] args)
    {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu girin: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu girin: ");
        fizik = inp.nextInt();;

        System.out.println("Kimya notunuzu girin: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuzu girin: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuzu girin: ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuzu girin: ");
        muzik = inp.nextInt();

        sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalamanız: " + sonuc);
        System.out.println(sonuc>=60?"Sınıfı Geçtiniz!":"Sınıfta Kaldınız!");
    }
}
