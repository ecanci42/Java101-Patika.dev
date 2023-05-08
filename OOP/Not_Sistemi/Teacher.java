package Not_Sistemi;

public class Teacher
{
    String name;
    String mpno;
    String branch;

    Teacher(String name,  String branch, String mpno)
    {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;

    }

    // Öğretmenin bilgilerini yazdıran metot.
    void print()
    {
        System.out.println("Adı: " + this.name);
        System.out.println("Bölümü: " + this.branch);
        System.out.println("Telefonu: " + this.mpno);
    }
}
