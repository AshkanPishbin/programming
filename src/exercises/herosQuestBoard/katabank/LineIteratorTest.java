package challenge.katabank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LineIteratorTest {

    @Test
    void testHasNext() {
        List<String> lines = getTestLines();
        LineIterator iterator = new LineIterator(lines);
        assertTrue(iterator.hasNext(), "It should have a next line");
    }

    @Test
    void testHasNoNext() {
        List<String> lines = new ArrayList<>();
        LineIterator iterator = new LineIterator(lines);
        assertFalse(iterator.hasNext(), "It should have no next line");
    }

    @Test
    void testTwoLines() {
        List<String> lines = getTestLines();
        LineIterator iterator = new LineIterator(lines);

        Line expectedLine1 = new Line("line1", "line2", "line3");
        Line expectedLine2 = new Line("line5", "line6", "line7");

        Line line1 = iterator.next();
        Line line2 = iterator.next();

        assertEquals(expectedLine1, line1, "The line does not match the expectation");
        assertEquals(expectedLine2, line2, "The line does not match the expectation");
    }

    private List<String> getTestLines() {
        String[] split = "line1, line2, line3, line4, line5, line6, line7, line8".split(", ");
        return Stream.of(split)
                .collect(Collectors.toList());
    }
}