package org.example.lesson_b;

import java.util.Random;

public class HomeWork {

    public static void main (String[] args) {
        int[] arr = {1,0,1,1,0,1,1,0,0,1,1};
        change (arr);
        int[] arr2 = new int [8];
        fill(arr2);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiply(arr3);
        int[][] arr4 = new int [8][8];
        oneone (arr4);
        int[] arr5 = new int[15];
        maxmin(arr5);
    }

    static void change (int[] InputArray) // Задание №1
    {
        System.out.print("Исходный массив:   ");
        for (int i =0; i < InputArray.length; i++)
        {
            System.out.print(InputArray[i] + " ");
        }
        System.out.println();

        System.out.print("Полученный массив: ");
        for (int i =0; i < InputArray.length; i++)
        {
            if (InputArray[i] == 0) InputArray[i] = 1;
            else InputArray[i] = 0;
            System.out.print(InputArray[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    static void fill (int[] InputArray) // Задание №2
    {
        for (int i = 0; i < InputArray.length; i++)
        {
            if (i == InputArray.length - 1) {
                InputArray[i] = InputArray[i-1] + 3;
                System.out.print(InputArray[i] + " ");
            }

            else {
                InputArray[i + 1] = InputArray[i] + 3;
                System.out.print(InputArray[i] + " ");
            }
            }
        System.out.println();
        System.out.println();
    }

    static void multiply (int[] InputArray) { // Задание №3
        for (int i = 0; i < InputArray.length; i++)
        {
            if (InputArray[i] < 6) {
                System.out.print((InputArray[i] * 6) + " ");
            }
            else System.out.print(InputArray[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    static void oneone (int[][] InputArray) { // Задание #4
        for (int y = 0; y < InputArray.length; y++) { // Диагональ слева направо
            for (int x = 0; x < InputArray[y].length; x++) {
                if (y == x) InputArray[y][x] = 1;
            }
        }
        for (int y = 0; y < InputArray.length; y++) { // Диагональ справа налево
            for (int x = InputArray[y].length - 1; x >= 0; x--) {
                InputArray[y][x] = 1;
                y++;
            }
        }
        for (int y = 0; y < InputArray.length; y++) { //Вывод массива
            for (int x = 0; x < InputArray[y].length; x++) {
                System.out.print(InputArray[y][x] + " ");
            }
        System.out.println();
        }
    }

    static void maxmin (int[] InputArray){ // Задание #5
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < InputArray.length; i++){
            InputArray[i] = random.nextInt(56);
            System.out.print(InputArray[i] + " ");
        }
        System.out.println();

        int min = InputArray[0]; int max = InputArray[0];
        for (int i = 0; i < InputArray.length; i++){
           if (InputArray[i] >= max) max = InputArray[i];
           if (InputArray[i] <= min) min = InputArray[i];
        }
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);


    }
}

