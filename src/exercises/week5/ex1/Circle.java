package exercise.week5.ex1;

public class Circle implements Shape{

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
