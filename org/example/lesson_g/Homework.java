package org.example.lesson_g;

import java.util.Scanner;

public class Homework {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int countHappyCats = 0;
        Cat cat1 = new Cat("Murzik", 30, false);
        Cat cat2 = new Cat("Barsik", 45, false);
        Cat cat3 = new Cat("Memeow", 15, false);
        Cat cat4 = new Cat("Ryzhik", 20, false);
        Cat[] catArray = {cat1, cat2, cat3, cat4};
        Bowl bowl = new Bowl();
        System.out.println(cat1);
        System.out.println("Give us food!!!");
        System.out.print("Enter the amount of food: ");
        bowl.putFood(scanner.nextInt());
        for (Cat cats: catArray) {
                if (cats.getAppetite() > bowl.getFoodAmount()) {
                    cats.sadMeow();
                    cats.setSatiety(false);
                    System.out.println(cats);
                } else {
                    cats.eat(bowl);
                    cats.setSatiety(true);
                    System.out.println(cats);
                    countHappyCats++;
                }
            }
        if (countHappyCats == catArray.length) System.out.println("All cats are happy!");
        else System.out.printf("Number of well-fed cats: %d\n " +
                "Number of hungry cats: %d", countHappyCats, catArray.length-countHappyCats);
        }
}
