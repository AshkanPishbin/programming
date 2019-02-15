package exercises.herosQuestBoard.debtcalculator;

import java.util.List;
import java.util.Scanner;

public class Banker {

    public void collectHowMuchTheyPaid(List<Person> people) {
        Scanner scanner = new Scanner(System.in);
        for (Person person : people) {
            collectMoneyFrom(person, scanner);
        }
    }

    private void collectMoneyFrom(Person person, Scanner scanner) {
        String name = person.getName();
        System.out.print(name + ", how much did you pay? ");
        Double paid = scanner.nextDouble();
        person.setPaid(paid);
    }


    public void displayDifference(List<Person> people) {
        for (Person person : people) {
            displayOneDifference(person);
        }
    }

    String displayOneDifference(Person person) {
        String name = person.getName();
        if (isEven(person)) {
            String message = name + ", you are even!";
            System.out.println(message);
            return message;
        }
        Double difference = person.getDifference();
        if (owsMoney(person)) {
            String message = name + ", you owe " + difference + " Euro";
            System.out.println(message);
            return message;
        }
        difference = Math.abs(difference);
        String message = name + ", you are owed " + difference + " Euro";
        System.out.println(message);
        return message;
    }

    private boolean isEven(Person person) {
        return person.getDifference().equals(0.0);
    }

    private boolean owsMoney(Person person) {
        return person.getDifference() > 0;
    }

}
