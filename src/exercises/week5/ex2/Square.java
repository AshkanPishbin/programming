package exercise.week5.ex2;

import exercise.week5.ex1.Shape;

public class Square implements Shape {

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
