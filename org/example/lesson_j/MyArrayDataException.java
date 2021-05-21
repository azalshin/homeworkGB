package org.example.lesson_j;

public class MyArrayDataException extends Exception{
    public int y;
    public int x;

    MyArrayDataException(int y, int x){
        this.y = y;
        this.x = x;
    }

}
