package exercises.herosQuestBoard.katabank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitIteratorTest {

    @Test
    void testHasNext() {
        Line line = new Line("123456", "123456", "123456");
        DigitIterator iterator = new DigitIterator(line);
        assertTrue(iterator.hasNext());
    }

    @Test
    void testHasNoNext() {
        Line line = new Line("", "", "");
        DigitIterator iterator = new DigitIterator(line);
        assertFalse(iterator.hasNext());
    }

    @Test
    void testNext() {
        Line line = new Line("123456", "123456", "123456");
        DigitIterator iterator = new DigitIterator(line);

        Digit expected1 = new Digit("123", "123", "123");
        Digit expected2 = new Digit("456", "456", "456");

        Digit digit1 = iterator.next();
        Digit digit2 = iterator.next();

        assertEquals(expected1, digit1, "Digits are not the same");
        assertEquals(expected2, digit2, "Digits are not the same");
    }
}