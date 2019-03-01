package at.nacs.primenumber.controller;

    @Component
    @Value
    public class PrimeAdder {

        PrimeCollector primeCollector;

        public long calculateSum(List<Integer> primeNumbers) {
            return primeNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
    }
}
