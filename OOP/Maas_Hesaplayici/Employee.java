package Maas_Hesaplayici;

public class Employee
{
    String name;
    int salary;
    int workHours;
    int hireYear;
    double result;
    double hoursBonus;
    double raise;

    Employee(String name, int salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        double result = 0.0;
        double hoursBonus = 0.0;
        double raise = 0.0;
    }

    // Maaşa uygulanan zammı hesaplayan metot.
    void tax()
    {

        if (salary > 1000)
        {
            result = (salary * 3.0) / 100;
        }
    }

    // Haftalık çalışma saatine göre bonus hesaplayan metot.
    void bonus()
    {
        if (this.workHours > 40)
        {
            int start = 40, i = 0, j = 1;

            while (++start <= this.workHours)
                i++;

            while (j++ <= i)
                this.hoursBonus += 30.0;

        }else
            this.hoursBonus = 0.0;
    }

    // Çalıştığı yıla göre zam hesaplayan metot.
    void raiseSalary()
    {
        int i = 0;
        int start = this.hireYear;
        while (start++ <= 2021)
            i++;
        if (i < 10)
        {
            this.raise = (salary * 5.0) / 100;
        } else if (i > 9 && i < 20)
        {
            this.raise = (salary * 10.0) / 100;
        } else if (i > 19)
        {
            this.raise = (salary * 15.0) / 100;
        }
    }

    // Personelin bilgilerini yazdıran metot.
    public void tostring()
    {
        System.out.println("\n====Personel Bilgileri Aşağıdadır====\n");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.result);
        System.out.println("Bonus: " + this.hoursBonus);
        System.out.println("Maaş Artışı: " + this.raise);
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (this.salary + this.hoursBonus - this.result));
        System.out.println("Toplam Maaş: " + (this.salary + this.raise)); // Toplam maaşa vergi ve bonuslar dahil edilmiyor. Net maaş.
    }
}
