package Not_Sistemi;

public class Course
{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int vrbNote;

    Course(String name, String code, String prefix)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int vrbNote = 0;
    }

    // Derse öğretmen atayan metot.
    void addTeacher(Teacher teacher)
    {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacherInfo();
        }
        else
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor!");
    }

    // Öğretmen hakkında bilgi veren metot.
    void printTeacherInfo()
    {
        this.teacher.print();
    }
}
