package at.nacs.primeadder.controller;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrimesTest {

    @Autowired
    Primes primes;

    @ParameterizedTest
    @CsvSource({
            "true, 2",
            "true, 5",
            "false, 4",
            "false, -1",
            "false, 0",
            "false, 1",

    })
    void isPrime(boolean expected, int candidate) {
        boolean actual = Primes.isPrime(candidate);
        Assertions.assertEquals(expected,actual);


    }
}