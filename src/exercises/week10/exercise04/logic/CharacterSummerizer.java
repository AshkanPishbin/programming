package exercises.week10.exercise04.logic;

import exercises.week10.exercise04.data.CharacterPerformance;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharacterSummerizer {
    List<CharacterPerformance> characterPerformances = new CharacterReader().getPerformance();

    public long displayTotalOfCharacters() {
        return characterPerformances.stream()
                .count();
    }

    public long displayNumberOfDiedCharecter() {
        return characterPerformances.stream()
                .collect(Collectors.groupingBy(e -> !e.getDeathyear().isEmpty()))
                .entrySet()
                .stream()
                .count();
    }

    public String displayTheOverallPercentageOfMenAndWomenThatDied() {
        return characterPerformances.stream()
                .filter(s -> !s.getDeathyear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getGender().replaceAll("0", "woman").replaceAll("1", "man"), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / displayNumberOfDiedCharecter() + "%")
                .collect(Collectors.joining(" "));
    }

    public Optional<Map.Entry<String, Long>> displayBookWithTheBiggestDeathCount() {
        return characterPerformances.stream()
                .filter(e -> !e.getDeathyear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();
    }

    public List<String> displayDiedPersonsInTheseBook() {
        return characterPerformances.stream()
                .filter(e -> !e.getDeathyear().isEmpty())
                .filter(e -> e.getBookOfDeath().equals("3"))
                .collect(Collectors.groupingBy(e -> e.getName(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }





}

//Who died in that book?
//Which ones are the two allegiances that have the biggest dead count?
//Which percentage of deaths belong to nobility characters?
//In which book die the most amount of characters from the Stark allegiance?
//In which book die the most amount of characters from the Lannister allegiance?
//How many Starks have died?
//How many Lannisters have died?
//Is there any character who didn’t die?
//Has any character ever been killed in the same chapter that it got introduced?