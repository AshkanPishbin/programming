package exercise.week2.two.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {

    private Scanner scanner = new Scanner(System.in);

    public List<Integer> gatherSteps() {
        List<Integer> stepsFromEveryone = new ArrayList<>();
        for (int times = 0; times < 3; times++) {
            Integer steps = askForSteps();
            stepsFromEveryone.add(steps);
        }
        return stepsFromEveryone;
    }

    private Integer askForSteps() {
        System.out.println("How many steps did you count?");
        return scanner.nextInt();
    }

}
