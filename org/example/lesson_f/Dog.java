package org.example.lesson_f;

public class Dog extends Animal{
    protected static int dogCount;
    Dog (String name, String color, int age)
    {
        super (name, color, age);
        dogCount++;
    }

    @Override
    protected boolean run(String name, double meter) {
        double meters = meter;
        if (meter > 500) return false;
        else return true;

    }

    @Override
    protected boolean swim(String name, double meter) {
        double meters = meter;
        if (meter > 10) return false;
        else return true;
    }
}
