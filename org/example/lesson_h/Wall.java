package org.example.lesson_h;

public class Wall implements Barrier {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean success(Action action) {
        if (action.jumpBarrier(this.height)) {
            System.out.println(action.name() + ": successfully jumped over the wall!");
            return true;
        } else {
            System.out.println(action.name() + ": failed jump!");
            return false;
        }
    }
}