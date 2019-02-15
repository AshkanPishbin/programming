package exercises.week5.ex3;

import exercises.week5.ex1.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getName() {
        String expectedName = "rectangle";
        String expectedColor = "violet";

        Rectangle rectangle = new Rectangle();
        assertEquals(expectedName, rectangle.getName());
        assertEquals(expectedColor, rectangle.getColor());

        Shape shape = new Rectangle();
        assertEquals(expectedName, shape.getName());

        Colored colored = new Rectangle();
        assertEquals(expectedColor, colored.getColor());
    }
}