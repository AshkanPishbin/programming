package exercises.week09.exercise03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {

    private Caesar caeser =new Caesar();

    @Test
    void testLowercaseLetter() {
        String actual = caeser.cipher("yz",2);
        String expected = "ab";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testCapitalLetter() {
        String actual = caeser.cipher("YZ",2);
        String expected = "AB";
        Assertions.assertEquals(expected,actual);
    }
}