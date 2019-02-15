package exercises.week09.exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("evenNumbers: ");
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 == 1)
                .collect(Collectors.toList());
        System.out.println("oddNumbers: ");
        System.out.println(oddNumbers);

        List<Integer> divisibleNumber = numbers.stream()
                .filter(number -> number % 3 == 0)
                .filter(number -> number > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: ");
        System.out.println(divisibleNumber);

        List<Integer> multiplyNumbers = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3: ");
        System.out.println(multiplyNumbers);

        List<String> collect = numbers.stream()
                .filter(e -> e > 8)
                .filter(e -> e < 12)
                .map(num -> "number " + num + " has " + num.toString().length() + " digits")
                .collect(Collectors.toList());
        System.out.println("Digits of numbers bigger than 8 and smaller than 12:");
        System.out.println(collect);
    }
}
