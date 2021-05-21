package org.example.lesson_g;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;


    }
    public boolean getSatiety () {
        return satiety;
    }

    public void setSatiety (boolean satiety) {
         this.satiety = satiety;
    }

    public void sadMeow () {
        System.out.println(this.name + " meowed sadly");
    }

    public void eat(Bowl bowl) {
        System.out.printf("%s ate for some food\n", this.name);
        bowl.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
