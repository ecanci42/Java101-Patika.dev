import java.util.Scanner;

public class Kullanici_Giris_Ekrani
{
    public static void main(String[] args)
    {
        String userName, password, passwdChange, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        //equals java'da string değerlerin eşitliğini kontrol etmek için kullanılır.
        if (userName.equals("patika") && password.equals("Java123"))
        {
            System.out.println("Giriş Yaptınız!");
        }else
        {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.print("Şifrenizi Sıfırlamak İçin 'Evet' Yazın: ");
            passwdChange = input.nextLine();
            if (passwdChange.equals("Evet"))
            {
                System.out.print("Yeni Şifrenizi Girin: ");
                newPassword = input.nextLine();

                //Burada şifre aynı girildiği sürece tekrar yazması için loop olarak bir while kullandık.
                while (newPassword != password)
                {
                    if (newPassword.equals("Java123"))
                    {
                        System.out.print("Yeni Şifreniz Eskisi ile Aynı Olamaz! \nLütfen Farklı Bir Şifre Girin: ");
                        newPassword = input.nextLine();
                    }else
                    {
                        System.out.println("Şifreniz Güncellenmiştir! \nLütfen Giriş Bilgilerinizi Kimseyle Paylaşmayın!");
                        break;
                    }
                }
            }
        }
    }
}
