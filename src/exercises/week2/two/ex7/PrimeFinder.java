package exercise.week2.two.ex7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    List<Integer> findFirst100Primes(List<Integer> numbers) {
        Integer primesFound = 0;
        List<Integer> primes = new ArrayList<>();
        for (Integer number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
                primesFound++;
                if (primesFound == 100) {
                    return primes;
                }
            }
        }
        return primes;
    }

    private boolean isPrime(Integer number) {
        BigInteger potentialPrime = BigInteger.valueOf(number);
        return potentialPrime.isProbablePrime(100);
    }

}
