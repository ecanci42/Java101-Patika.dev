package Boxing_Text_Game;

public class Match
{
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight)
    {
        if (fightRandom())
        {
            this.f1 = f1;
            this.f2 = f2;
        }else
        {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Yeni round'u başlatıp, kalan sağlıkları gösteren metot.
    public void run()
    {
        if (isCheck())
        {
            while (this.f1.heal > 0 && this.f2.heal > 0)
            {
                System.out.println("====YENİ ROUND====");
                this.f2.heal = this.f1.hit(f2);
                if (isWin())
                    break;
                this.f1.heal = this.f2.hit(f1);
                if (isWin())
                    break;
                System.out.println(this.f1.name + " Sağlık: " + this.f1.heal);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.heal);
            }
        }else
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
    }

    // Dövüşçülerin sikletini kontrol eden metot.
    boolean isCheck()
    {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    // Canı 0'a ilk düşeni tespit eden metot.
    boolean isWin()
    {
        if (this.f1.heal == 0)
        {
            System.out.println(this.f2.name + " kazandı.");
            return (true);
        }
        if (this.f2.heal == 0)
        {
            System.out.println(this.f1.name + " kazandı.");
            return (true);
        }
        return (false);
    }

    // İlk vuruşu kimin yapacağını belirleyen metot.
    boolean fightRandom()
    {
        double randomNumber = Math.random() * 100;
        return (randomNumber <= 50);
    }
}
