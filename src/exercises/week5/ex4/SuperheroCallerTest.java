package exercise.week5.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SuperheroCallerTest {

    private SuperheroCaller caller = new SuperheroCaller();

    @Test
    void call() {
        Superhero superhero = caller.call();

        assertNotNull(superhero);

        String name = superhero.getName();
        String options = "Batman Superman Spiderman";
        assertTrue(options.contains(name));
    }
}