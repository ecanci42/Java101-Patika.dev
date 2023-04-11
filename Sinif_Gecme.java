import java.util.Scanner;

public class Sinif_Gecme
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int mat,fiz,tr,kim,muzik,toplam,derssayisi;
        toplam=0;
        derssayisi=5;
        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        if (mat>100||mat<0){
            System.out.println("Hatalı not girdiniz.Ortalamaya katılmayacak.");
            derssayisi=derssayisi-1;
        }else{
            toplam=toplam+mat;
        }
        System.out.println("Fizik notunuzu giriniz:");
        fiz=input.nextInt();
        if (fiz>100||fiz<0){
            System.out.println("Hatalı not girdiniz.Ortalamaya katılmayacak.");
            derssayisi=derssayisi-1;
        }else{
            toplam=toplam+fiz;
        }
        System.out.println("Türkçe notunuzu giriniz:");
        tr=input.nextInt();
        if (tr>100||tr<0){
            System.out.println("Hatalı not girdiniz.Ortalamaya katılmayacak.");
            derssayisi=derssayisi-1;
        }else{
            toplam=toplam+tr;
        }
        System.out.println("Kimya notunuzu giriniz:");
        kim=input.nextInt();
        if (kim>100||kim<0){
            System.out.println("Hatalı not girdiniz.Ortalamaya katılmayacak.");
            derssayisi=derssayisi-1;
        }else{
            toplam=toplam+kim;
        }
        System.out.println("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        if (muzik>100||muzik<0){
            System.out.println("Hatalı not girdiniz.Ortalamaya katılmayacak.");
            derssayisi=derssayisi-1;
        }else{
            toplam=toplam+muzik;
        }
        double ortalama=(toplam)/derssayisi;
        if(ortalama<=55){
            System.out.println("Sınıfta kaldınız.");
        }else{
            System.out.println("Sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız:"+ortalama);
    }
}
