package org.example.lesson_h;

public class Treadmill implements Barrier {
    private double distance;

    public Treadmill(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean success (Action action) {
        if (action.runDistance(this.distance)){
            System.out.println(action.name() + ": successfully ran the distance!");
            return true;
        }
        else {
            System.out.println(action.name() + ": could not run the distance");
            return false;
        }
    }
}
