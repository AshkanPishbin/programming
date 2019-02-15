package exercise.week2.two.ex7;

import java.util.List;

public class First100PrimesCalculator {

    private NumberGenerator generator = new NumberGenerator();
    private PrimeFinder primeFinder = new PrimeFinder();
    private NumberAccumulator accumulator = new NumberAccumulator();

    public Integer getSumOfThe100FirstPrimeNumbers() {
        List<Integer> numbers = generator.generateFirst550();
        List<Integer> primes = primeFinder.findFirst100Primes(numbers);
        return accumulator.accumulate(primes);
    }

}
