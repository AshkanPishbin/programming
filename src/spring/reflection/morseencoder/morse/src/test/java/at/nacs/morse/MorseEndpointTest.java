package at.nacs.morse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class MorseEndpointTest {

    @Autowired
    TestRestTemplate testRestTemplate;
    String url = "/morse";

    @ParameterizedTest
    @CsvSource({
            "_ . . . ., 6",
            "_ _ _ _ ., 9",
            ". _, A",
            "., E"
    })
    void sendLetter(String expected, String input) {
        String actual = testRestTemplate.postForObject(url, input, String.class);
        Assertions.assertEquals(expected, actual);
    }
}