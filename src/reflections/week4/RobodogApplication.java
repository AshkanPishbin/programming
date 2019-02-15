package reflection.week4;

import exercise.week4.ex9.FileReader;

import java.util.*;

public class RobodogApplication {

    // read all lines
    // transform lines into instructions - put away the "!"s
    // find unique instructions
    // display: how many, which ones
    // figure out frequencies
    // figure out most appearing instruction
    // display


    public static void main(String[] args) {
        List<String> lines = readLines();
        List<String> instructions = toInstructions(lines);
        Set<String> unique = new HashSet<>(instructions);
        display(unique);
        displayFrequencyAndMostAppearing(instructions);
    }

    private static List<String> readLines() {
        FileReader reader = new FileReader();
        return reader.asLines("reflection/week4/robodog.txt");
    }

    private static List<String> toInstructions(List<String> lines) {
        List<String> instructions = new ArrayList<>();
        for (String line : lines) {
            String instruction = line.replaceAll("!", "");
            instructions.add(instruction);
        }
        return instructions;
    }

    private static void display(Set<String> instructions) {
        System.out.println("Number of unique instructions: " + instructions.size());
        System.out.println("Commands: " + instructions);
    }

    private static void displayFrequencyAndMostAppearing(List<String> instructions) {
        Map<String, Integer> frequencies = new HashMap<>();
        for (String instruction : instructions) {
            if (!frequencies.containsKey(instruction)) {
                frequencies.put(instruction, new Integer(0));
            }
            Integer times = frequencies.get(instruction);
            frequencies.put(instruction, times + 1);
        }

        System.out.println("Frequency: " + frequencies);

        Set<Map.Entry<String, Integer>> entries = frequencies.entrySet();
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(entries);
        Collections.sort(sorted, Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(sorted);
        Map.Entry<String, Integer> mostAppearing = sorted.get(0);

        System.out.println("Most used command: " + mostAppearing.getKey()
                + " | " + mostAppearing.getValue() + " times");

    }

}
