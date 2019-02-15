package exercises.week3.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberCorrectorTest {
    NumberCorrector numberCorrector = new NumberCorrector();

    @Test
    void testCorrectNumber() {
        int doubleToInt = numberCorrector.correct(-12.4);
        Assertions.assertEquals(12, doubleToInt);
    }
}