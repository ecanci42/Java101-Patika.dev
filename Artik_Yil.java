import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            if (year % 100 != 0 && year % 4 == 0) {
                System.out.println(year + " bir artık yıldır!");
            } else {
                System.out.println(year + " bir artık yıl değildir!");
            }
        }
    }
}