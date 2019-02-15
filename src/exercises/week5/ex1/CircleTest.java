package exercises.week5.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getName() {
        String expected = "circle";

        Circle circle = new Circle();
        assertEquals(expected, circle.getName());

        Shape shape = new Circle();
        assertEquals(expected, shape.getName());
    }
}