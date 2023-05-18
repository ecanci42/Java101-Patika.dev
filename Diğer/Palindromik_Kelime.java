import java.util.Scanner;

public class Palindromik_Kelime
{
    static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;

        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Lütfen Bir Kelime Girin: ");
        str = input.next();

        if (isPalindrome(str))
            System.out.println("Girdiğiniz kelime plondromik bir kelimedir.");
        else
            System.out.println("Girdiğiniz kelime polindromik bir kelime değildir.");
    }
}
