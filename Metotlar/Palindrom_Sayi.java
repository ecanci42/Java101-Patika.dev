public class Palindrom_Sayi
{
    static boolean isPalindrom(int num)
    {
        int temp = num, revNum = 0, lstnum;

        while (temp != 0)
        {
            lstnum = temp % 10;
            revNum = (revNum * 10) + lstnum;
            temp /= 10;
        }

        if (num == revNum)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrom(101));
    }
}
