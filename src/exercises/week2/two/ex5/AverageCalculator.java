package exercise.week2.two.ex5;

import java.util.List;

public class AverageCalculator {

    public Double calculateAverage(List<Integer> stepsFromEveryone) {
        Integer sum = 0;
        for (Integer steps : stepsFromEveryone) {
            sum += steps;
        }
        Double average = sum / new Double(stepsFromEveryone.size());
        return average;
    }

}
