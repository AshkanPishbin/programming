package exercises.week09.exercise04;

import java.util.Comparator;

public class HappinessApplication {
    public static void main(String[] args) {

        new FileReader().asStream("exercises/week09/exercise04/world-happiness-2017.csv")
                .skip(1)
                .map(s -> s.split(";"))
                .map(e -> new HappinessRecord(e[0], Integer.valueOf(e[1]), Double.valueOf(e[2])))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(happinessRecord -> System.out.println("Rank: " + happinessRecord.getRank() + " | Country: " + happinessRecord.getCountry() + " | Score: " + happinessRecord.getScore()));
    }
}

