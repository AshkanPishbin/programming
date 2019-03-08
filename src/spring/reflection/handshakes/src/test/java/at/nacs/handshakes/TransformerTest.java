package at.nacs.handshakes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TransformerTest {

    @Autowired
    Transformer transformer;

    @ParameterizedTest
    @CsvSource({

            "thousand knuckles - thumb touches back - bro knock,926",
            "thumb touches back - bro knock - thousand knuckles,269",
            "tickles over palm - thumb touches back - thumb touches back,522",
            "thousand knuckles - thousand knuckles - thousand knuckles,999",
    })
    void testResult(String handshake, Integer price) {
        List<String> actual = transformer.transform(price);
        List<String> expected = List.of(handshake.split(" - "));
        Assertions.assertEquals(expected, actual);

    }
}

