package exercises.herosQuestBoard.debtcalculator;

import java.util.Arrays;
import java.util.List;

public class DebtCalculatorApplication {

    public static void main(String[] args) {
        List<Person> people = getPeople();
        Calculator calculator = new Calculator();
        Banker banker = new Banker();
        banker.collectHowMuchTheyPaid(people);
        calculator.calculateDifference(people);
        banker.displayDifference(people);
    }

    private static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Hala"),
                new Person("Mohamed"),
                new Person("Tamara"),
                new Person("Adib")
        );
    }

}
