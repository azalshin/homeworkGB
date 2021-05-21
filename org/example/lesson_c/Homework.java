package org.example.lesson_c;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    static Scanner scanner = new Scanner(System.in);
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};
    static String chosenWord = choseWordAI(words);

    public static void main (String [] arg) {

        System.out.println("Угадай загаданное слово (фрукт, овощ) на английском!");
//        System.out.println(chosenWord);
//        checkAnswer(chosenWord);
        Random randomLength = new Random();
        int[] array = new int[(randomLength.nextInt(4))+4];
        int[] array2 = {2, 5, 3, 1};
//        printArray(array2);
//        System.out.println(checkBalance(array2));
//        fillArray(array);
        printArray(array2);
//        System.out.println(checkBalance(array));
        System.out.println("Введите величину сдвига: ");
        int n = scanner.nextInt();
        arrayShift(array2, n);
        printArray(array2);


    }

    static String choseWordAI (String[] array) { // Задание 1: рандомный выбор слова
        Random random = new Random();
        int index = random.nextInt(array.length);
        String word = array[index];
        return word;

    }

    static void checkAnswer (String word) { // Задание №1: проверка ответа. Метод получился очень громоздким. Постараюсь в будущем весь код доработать
        char[] wordsChar = new char[word.length()];
        char[] quote = new char[15];
        quote = word.toCharArray();
        wordsChar = word.toCharArray();
        boolean check = false;
        String answer = "";
        char[] answersChar = new char[answer.length()];
        int tries = 1;
        do {
            System.out.printf("Попытка №%s: \n", tries);
            answer = scanner.next();
            answersChar = answer.toCharArray();
            if (word.equals(answer)) {
                System.out.println("Угадал!");
                check = true;
                break;
            } else {
                for (int i = 0; i < wordsChar.length && i < answersChar.length; i++) {
                    if (wordsChar[i] != answersChar[i]) quote[i] = '#';
                    else quote[i] = wordsChar[i];
                }
            }
            System.out.println("Подсказка: ");
            for (int n = 0; n < quote.length; n++) {
                System.out.print(quote[n]);

            }
            System.out.println("#############");
            tries++;
        }
        while (check==false);
    }

    static int[] fillArray (int[] array) { // Задание №2: заполнение массива
        Random randomNum = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (randomNum.nextInt(10));
        }
        return array;
    }
    static void printArray (int[] array) { // Печать массива
        System.out.println(Arrays.toString(array));
    }

    static boolean checkBalance (int[] array) { // Задание №2: проверка баланса
        boolean check = false;
        int[] arrayStep = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayStep[i] = array[i];
        }
        printArray(arrayStep);
        int step = 1;
        do {
            int summ = 0;
            int summ2 = 0;
            for (int j = 0+step; j < array.length; j++) {
                summ += array[j];
            }
            for (int n = 0; n < step; n++) {
                summ2 += arrayStep[n];
            }
            step++;
            if (summ != summ2) {
                continue;
            }
            else {
                System.out.println(summ + " " + summ2); // вывод сумм при успешной проверке
                check = true;
            }

        } while (step < array.length);
            return check;
    }
    static void arrayShift (int[] array, int step) { // Задание №3: тут я сдался, скопировал с урока
        int shift = (array.length + step % array.length) % array.length;
        for (int i = 0; i < shift; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}

