package at.nacs.handshakes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class PriceTest {

    @Autowired
    Price price;

    @ParameterizedTest
    @CsvSource( {
            "8 - 0 - 1 - 8,8018",
            "9 - 1 - 9,919",
            "1 - 9 - 5,195",
            "3 - 9 - 2,392",
    })
    void kontroller(String numbers, Integer digits) {
        List<String> split = List.of(numbers.split(" - "));
        List<Integer> expected = split.stream()
                .map(e -> Integer.valueOf(e))
                .collect(Collectors.toList());
        List<Integer> actual = price.splitter(digits);
        Assertions.assertEquals(expected, actual);
    }
}





