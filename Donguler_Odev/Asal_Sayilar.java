public class Asal_Sayilar
{
    public static void main(String[] args)
    {
        int i = 2;

        while (i <= 100)
        {
            boolean prime = true;
            int j = 2;

            while (j < i)
            {
                if (i % j == 0)
                {
                    prime = false;
                    break;
                }
                j++;
            }

            if (prime)
                System.out.print(i + " ");
            i++;
        }
    }
}
