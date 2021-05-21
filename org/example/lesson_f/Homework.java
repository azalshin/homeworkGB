package org.example.lesson_f;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        double distanceRun;
        double distanceSwim;
        Scanner scanner = new Scanner(System.in);
        Dog d1 = new Dog("Мухтар", "Brown", 5);
        Dog d2 = new Dog("Рекс", "Brown and Black", 7);
        Cat c1 = new Cat("Mяут", "Grey", 2);
        Cat c2 = new Cat("Пушок", "White", 3);
        Cat c3 = new Cat("Васька", "Черно-белый", 4);
        System.out.printf("Общее количество животных: %s \n" +
                "Количество котов: %s \n" +
                "Количество собак: %s \n", Animal.animalCount, Cat.catCount, Dog.dogCount);
        System.out.println();
        Animal[] animals = {d1, d2, c1, c2, c3};
        System.out.println("Введите дистанцию бега (например, 125,0): ");
        distanceRun = scanner.nextDouble();
        System.out.println("Введите дистанцию плавания (например, 5,5): ");
        distanceSwim = scanner.nextDouble();

        for (Animal animal: animals)
        {
            if (!animal.run(animal.name, distanceRun)) System.out.println("Животное по кличке " + animal.name + " не может пробежать такую дистанцию");
            else System.out.println("Животное по кличке " + animal.name + " пробежало дистанцию: " + distanceRun + " метров");
            if (!animal.swim(animal.name, distanceSwim) && animal instanceof Cat) System.out.println("Коты не умеют плавать");
            else if (!animal.swim(animal.name, distanceSwim)) System.out.println("Животное по кличке " + animal.name + " не может пропплыть такую дистанцию");
            else System.out.println("Животное по кличке " + animal.name + " проплыло дистанцию: " + distanceSwim + " метров");
        }

    }
}
