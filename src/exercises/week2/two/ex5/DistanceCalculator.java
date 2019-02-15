package exercise.week2.two.ex5;

public class DistanceCalculator {

    public Double calculateDistance(Double steps) {
        Double kilometersPerStep = 0.000762;
        return steps * kilometersPerStep;
    }

}
