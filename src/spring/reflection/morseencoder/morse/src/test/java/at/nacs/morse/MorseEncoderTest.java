package at.nacs.morse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = NONE)
class MorseEncoderTest {

    @Autowired
    MorseEncoder morseEncoder;

    @ParameterizedTest
    @CsvSource({
            "_ _ . .,Z",
            " . . _,U",
            " . . _ .,F"
    })
    void encoder(String symbul, String input) {
        String actual = morseEncoder.encoder(input);
        Assertions.assertEquals(symbul, actual);

    }
}
