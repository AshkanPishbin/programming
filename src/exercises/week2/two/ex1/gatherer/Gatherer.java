package exercise.week2.two.ex1.gatherer;

import exercise.week2.two.ex1.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

    private Scanner scanner = new Scanner(System.in);
    private AutomaticGatherer automaticGatherer = new AutomaticGatherer();

    public List<Hiker> signUp() {
        List<Hiker> hikers = new ArrayList<>();
        hikers.addAll(automaticGatherer.getConfirmedHikers());

        String name = askForName();
        while (!name.isEmpty()) {
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            name = askForName();
        }
        return hikers;
    }

    private String askForName() {
        System.out.print("Write your name: ");
        return scanner.nextLine();
    }

}
