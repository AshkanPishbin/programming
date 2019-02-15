package challenge.debtcalculator;

import java.util.List;

public class Calculator {

    public void calculateDifference(List<Person> people) {
        Double average = calculateAveragePaid(people);
        findDifferences(people, average);
    }

    private Double calculateAveragePaid(List<Person> people) {
        Double total = 0.0;
        for (Person person : people) {
            total += person.getPaid();
        }
        int numberOfPeople = people.size();
        double average = total / numberOfPeople;
        return average;
    }

    private void findDifferences(List<Person> people, Double average) {
        for (Person person : people) {
            Double difference = average - person.getPaid();
            person.setDifference(difference);
        }
    }
}
