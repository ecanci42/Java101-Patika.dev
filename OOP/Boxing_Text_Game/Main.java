package Boxing_Text_Game;

public class Main
{
    public static void main(String[] args)
    {
        Fighter f1 = new Fighter("Muhammed Ali", 10, 120, 80, 60);
        Fighter f2 = new Fighter("Mike Tyson", 15, 100, 100, 50);

        Match match = new Match(f1, f2, 80, 100);
        match.run();
    }
}
