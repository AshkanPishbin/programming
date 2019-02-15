package exercises.herosQuestBoard.katabank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FileReaderTest {

    private FileReader fileReader = new FileReader();

    @Test
    void testAsLines() {
        List<String> lines = fileReader.asLines("exercises/herosQuestBoard/katabank/accounts.csv");

        assertFalse(lines.isEmpty());
        assertEquals(4, lines.size());
        assertEquals("    _  _     _  _  _  _  _", lines.get(0));
        assertEquals("  | _| _||_||_ |_   ||_||_|", lines.get(1));
        assertEquals("  ||_  _|  | _||_|  ||_| _|", lines.get(2));
        assertEquals(" ", lines.get(3));
    }
}