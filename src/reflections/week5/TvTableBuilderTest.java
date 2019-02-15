package reflection.week5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TvTableBuilderTest {

    private TvTableBuilder builder = new TvTableBuilder();

    @Test
    void build() {
        String[] split = "leg, leg, leg, leg, shelf, top".split(", ");
        List<String> expected = Arrays.asList(split);

        TvTable tvTable = builder.build();

        List<String> parts = tvTable.getParts();

        assertEquals(expected.size(), parts.size());
        assertEquals(expected, parts);
    }
}