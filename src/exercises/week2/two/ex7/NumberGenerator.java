package exercise.week2.two.ex7;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    List<Integer> generateFirst550() {
        List<Integer> numbers = new ArrayList<>();
        for (int times = 1; times <= 550; times++) {
            numbers.add(times);
        }
        return numbers;
    }

}
