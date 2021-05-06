package org.example.lesson_e;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        //String FIO, int age, String workPosition, String telephone, String email, double salary
        Employer em1 = new Employer("Petrov Petr Petrovich", 53, "Engineer", "72-73-74", "petrovpp@gmail.com", 56432.5);
        Employer em2 = new Employer("Ivanov Ivan Ivanovich", 25, "Assistant", "77-78-79", "IIIvanov@mail.ru", 37550);
        Employer em3 = new Employer("Pavlova Valentina Andreevna", 31, "CEO", "77-77-77", "ceoSemyonov@yandex.ru", 150000);
        Employer em4 = new Employer("Petrova Natalya Ruslanocna", 43, "Cleaner", "+788005553535", "petrovaNR@mail.ru", 20000);
        Employer em5 = new Employer("Kuzmin Ilya Olegovich", 57, "Security", "77-77-77", "Kuzmin64@yandex.ru", 18000);
        Employer[] array = {em1, em2, em3, em4, em5};
        findOld(array);

    }
    public static void findOld (Employer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].age > 40) {
                array[i].aboutMe();
            }
            System.out.println();
        }
    }
}
