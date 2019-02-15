package exercises.week5.ex2;

import exercises.week5.ex1.Shape;

public class Triangle implements Shape {

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
