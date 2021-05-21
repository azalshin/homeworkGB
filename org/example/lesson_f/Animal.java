package org.example.lesson_f;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected static int animalCount;
    Animal (String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
        animalCount++;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setColor(String color) {
//        System.out.printf("%s with color %s will be colored in %s\n", this.name, this.color, color);
//        this.color = color;
//    }

    protected boolean run(String name, double meter)
    {
       return true;
    }

    boolean swim(String name, double meter)
    {
        return true;
    }
}
