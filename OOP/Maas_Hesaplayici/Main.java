package Maas_Hesaplayici;

public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("ecanci", 2000, 45, 1985);
        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.tostring();

        Employee e2 = new Employee("binurtas", 1000, 45, 1985);
        e2.tax();
        e2.bonus();
        e2.raiseSalary();
        e2.tostring();
    }
}
