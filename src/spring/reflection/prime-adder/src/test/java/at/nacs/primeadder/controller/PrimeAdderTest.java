package at.nacs.primeadder.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PrimeAdderTest {

    @Autowired
    PrimeAdder primeAdder;

    @ParameterizedTest
    @CsvSource({
            "5,2",
            "10,3",
            "17,4",
            "2,1",
            "24133,100",
    })
    void calculateSum(int expected, int limit) {
        int actual = primeAdder.calculateSum(limit);
        Assertions.assertEquals(expected, actual);
    }
}