package exercises.week11.exercise03;

import org.junit.jupiter.api.Test;

class ConverterTest {
    private Converter converter = new Converter();

    @Test
    void toWord() {
        String result = converter.toWord(24, 00);
        System.out.println(result);
    }
}