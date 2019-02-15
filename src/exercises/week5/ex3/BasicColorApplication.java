package exercises.week5.ex3;

import exercises.week5.ex1.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicColorApplication {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Name: " + rectangle.getName());
        Colored colored = (Colored) rectangle;
        System.out.println("Colored: " + colored.getColor());
        Shape shape = (Shape) rectangle;
        System.out.println("Shape: " + shape.getName());

        List<Rectangle> rectangles = Arrays.asList(rectangle);
        List<Colored> coloreds = Arrays.asList(rectangle, colored);
        List<Shape> shapes = Arrays.asList(rectangle, shape);

        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);

    }

}
