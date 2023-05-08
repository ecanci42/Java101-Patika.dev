package Boxing_Text_Game;

public class Fighter
{
    String name;
    int damage;
    int heal;
    int weight;
    int dodge;

    Fighter(String name, int damage, int heal, int weight, int dodge)
    {
        this.name = name;
        this.damage = damage;
        this.heal = heal;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100)
            this.dodge = dodge;
        else
            this.dodge = 0;
    }

    // Dövüşçülerin hasar vurup vuramadığını kontrol eden metot.
    int hit(Fighter foe)
    {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isDodge())
        {
            System.out.println(foe.name + " gelen hasarı blokladı!");
            System.out.println("------------------");
            return (foe.heal);
        }
        if (foe.heal - this.damage < 0)
            return (0);
        return (foe.heal - this.damage);
    }

    // Bloklama ihtimalini belirleyen metot.
    boolean isDodge()
    {
         double randomNumber = Math.random() * 100;
         return (randomNumber <= this.dodge);
    }
}
