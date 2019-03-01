package at.nacs.primeadder.controller;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.IntStream;

@Component
public class PrimeAdder {
    public int calculateSum(int limit) {
        return IntStream.iterate(2, e -> e + 1)
                .filter(Primes::isPrime)
                .limit(limit)
                .sum();
    }
}
