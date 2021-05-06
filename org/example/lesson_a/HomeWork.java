package org.example.lesson_a;

public class HomeWork {
    public static void main (String[] args) // Задание №1.
    {
        byte bt = 125;                         // Задание №2
        short sh = 32000;
        int i = 99999;
        long l = 55555555L;
        boolean bool = false;
        double d = 10.5;
        float fl = 45.2f;
        char ch = 'h';
        String str = "Geekbrains";
        System.out.println(calc(2.0f, 10.1f, 6.0f, 6.0f)); // Задание №3
        System.out.println(sum(5,5)); //Задание №4
        num (0); // Задание №5
        System.out.println(num2(-1)); // Задание №6
        hello("Азат"); // Задание №7
        leapyear(1500); // Задание №8
        leapyear(1600);
        leapyear(1900);
        leapyear(1995);
        leapyear(2000);
        leapyear(2020);
        leapyear(2016);
    }

    static float calc(float a, float b, float c, float d){ // Задание №3
        return a * (b + (c / d));
    }

    static boolean sum (double a1, double b1) { // Задание №4
        if (a1 + b1 >= 10 && a1 + b1 <=20)
        {
            return true;
        }
        else return false;
    }

    static void num (int a) { // Задание №5
        if (a >= 0) {
            System.out.println("Число " + a + " - положительное");
        }
        else System.out.println("Число " + a + " - отрицательное");

    }

    static boolean num2 (int b) { // Задание №6
        if (b < 0) {
            return true;
        } else return false;
    }

    static void hello (String N) { // Задание №7
        System.out.println("Привет, " + N + "!");
    }

    static void leapyear (int year) { // Задание №8
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + "-й - високосный год!");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "-й - високосный год!");
        } else {
            System.out.println(year + "-й - не високосный год!");
        }
    }
}
