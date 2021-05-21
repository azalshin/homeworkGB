package org.example.lesson_h;

public class Human implements Action{
    private String name;
    private double runLimit;
    private double jumpLimit;

    public Human(String name, double runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    public double getRunLimit() {
        return runLimit;
    }

    public double getJumpLimit() {
        return jumpLimit;
    }
    @Override
    public String name() {
        return this.name;
    }
    @Override
    public boolean runDistance(double distance) {
        return this.runLimit >= distance;
    }

    @Override
    public boolean jumpBarrier(double height) {
        return this.runLimit >= height;

    }
}
