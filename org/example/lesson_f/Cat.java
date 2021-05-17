package org.example.lesson_f;

public class Cat extends Animal{
    protected static int catCount;
    Cat (String name, String color, int age)
    {
        super (name, color, age);
        catCount++;
    }

    @Override
    protected boolean run(String name, double meter) {
        double meters = meter;
        if (meter > 200) return false;
        else return true;
    }


    @Override
    protected boolean swim(String name, double meter) {
        return false;
    }
}
