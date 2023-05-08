package Not_Sistemi;

public class Main
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher("İlber Ortaylı", "TRH", "0951");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0971");
        Teacher t3 = new Teacher("Celal Shengus", "JEO", "0931");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course jeoloji = new Course("Jeoloji", "101", "JEO");
        jeoloji.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal", "1448", "4", tarih, fizik, jeoloji);
        s1.addBulkExamNote(100, 50, 50, 60, 70, 80);
        s1.isPass();

        Student s2 = new Student("Fatih Altaylı", "1784", "4", tarih, fizik, jeoloji);
        s1.addBulkExamNote(50, 45, 30, 45, 40, 40);
        s2.isPass();

    }
}
