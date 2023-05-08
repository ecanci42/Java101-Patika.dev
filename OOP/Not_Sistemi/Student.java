package Not_Sistemi;

public class Student
{
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3)
    {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    // Öğrencinin ders notlarının geçerli bir değer olup olmadığını kontrol eden metot.
    void addBulkExamNote(int note1, int note2, int note3, int vrbNote1, int vrbNote2, int vrbNote3)
    {
        if (note1 >= 0 && note1 <= 100 && vrbNote1 >= 0 && vrbNote1 <= 100)
        {
            this.c1.note = note1;
            this.c1.vrbNote = vrbNote1;
        }
        if (note2 >= 0 && note2 <= 100 && vrbNote2 >= 0 && vrbNote2 <= 100)
        {
            this.c2.note = note2;
            this.c2.vrbNote = vrbNote2;
        }
        if (note3 >= 0 && note3 <= 100 && vrbNote3 >= 0 && vrbNote3 <= 100)
        {
            this.c3.note = note3;
            this.c3.vrbNote = vrbNote3;
        }
    }

    // Öğrencinin sınıfı geçip geçmediğini kontrol eden metot.
    void isPass()
    {
        this.avarage = (((this.c1.note * 0.8) + (this.c1.vrbNote * 0.2)) + ((this.c2.note * 0.7) +
                (this.c2.vrbNote * 0.3)) + ((this.c3.note * 0.9) + (this.c3.vrbNote * 0.1))) / 3.0;
        System.out.println("===========================");
        if (this.avarage >= 55)
        {
            System.out.println("Tebrikler, Sınıfı Geçtiniz!");
            this.isPass = true;
        }else
        {
            System.out.println("Üzgünüz, Sınıfı Geçemediniz!");
            this.isPass = false;
        }
        printNote();
    }

    // Öğrencinin notlarını ve ortalamasını yazdıran metot.
    void  printNote()
    {
        System.out.println(this.c1.name + " Sınav Notu: " + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu: " + this.c1.vrbNote);
        System.out.println(this.c2.name + " Sınav Notu: " + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu: " + this.c2.vrbNote);
        System.out.println(this.c3.name + " Sınav Notu: " + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu: " + this.c3.vrbNote);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
