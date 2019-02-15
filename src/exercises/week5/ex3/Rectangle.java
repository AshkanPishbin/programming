package exercises.week5.ex3;

import exercises.week5.ex1.Shape;

public class Rectangle implements Colored, Shape {

    @Override
    public String getColor() {
        return "violet";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getColor() + " " + getName();
    }
}
