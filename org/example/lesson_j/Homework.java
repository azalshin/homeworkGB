package org.example.lesson_j;

import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (2 значения): ");
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        String[][] arrayInt = new String[y][x];
        arrayInit(arrayInt);
        printArray(arrayInt);
        try {
            System.out.println("Сумма элементов в массиве равна: " + summElements(arrayInt));
        }
        catch (MyArrayDataException my){
            System.out.printf("В массиве попался не int. y = %d и x = %d \n", my.y, my.x);
        }
//        System.out.println(arrayInt.length + " " + arrayInt[0].length);
    }

    public static String[][] arrayInit (String[][] array){
//        String string = "56792145679";
//        char[] element = new char[string.length()];

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        if (array.length == 4 && array[0].length == 4) {
            System.out.println("Указан правильный размер массива");
            System.out.println("Введите набор цифр, который будет использован для массива без разделителей: ");
            String inputString = scanner.next();
            char[] element = new char[inputString.length()];
            element = inputString.toCharArray();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = String.valueOf(element[random.nextInt(inputString.length())]);
                }
            }
        }
        else throw new NumberFormatException ("Массив должен быть 4x4");
        return array;
    }

    public static void printArray (String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int summElements(String[][] array)  throws MyArrayDataException {
        int summInt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    summInt += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
        }
        }
        return  summInt;
    }
}
