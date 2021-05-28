package org.example.lesson_h;

public class Homework {
    public static void main(String[] args) {
        Action[] action = {
                new Cat("Meow", 250.0, 0.5),
                new Human("Joe", 500.3, 1.5),
                new Robot("T-1000", 1500.5, 2.5),
        };

        Barrier[] barriers = {
                new Treadmill(150),
                new Wall(0.5),
                new Treadmill(251),
                new Wall(1),
                new Treadmill(900),
                new Treadmill(1200),
                new Wall(1.35)
        };

        for (Action actionNum: action) {
            for (Barrier barrier: barriers)
            {
                if (!barrier.success(actionNum)) break;
            }
        }

    }
}
