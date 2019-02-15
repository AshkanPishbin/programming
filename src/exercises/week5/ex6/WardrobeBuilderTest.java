package exercises.week5.ex6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WardrobeBuilderTest {

    private WardrobeBuilder builder = new WardrobeBuilder();

    @Test
    void build() {
        String[] split = "bottom, side, side, back, top, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door".split(", ");
        List<String> expected = Arrays.asList(split);

        Wardrobe wardrobe = builder.build();

        List<String> parts = wardrobe.getParts();

        assertEquals(expected.size(), parts.size());
        assertEquals(expected, parts);
    }
}