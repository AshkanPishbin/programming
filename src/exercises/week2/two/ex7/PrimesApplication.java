package exercise.week2.two.ex7;

public class PrimesApplication {

    public static void main(String[] args) {
        First100PrimesCalculator first100PrimesCalculator = new First100PrimesCalculator();
        Integer sum = first100PrimesCalculator.getSumOfThe100FirstPrimeNumbers();
        System.out.println("The sum of the first 100 prime numbers is: " + sum);
    }

}
