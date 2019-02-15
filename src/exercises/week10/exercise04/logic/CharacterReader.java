package exercises.week10.exercise04.logic;

import exercises.week10.exercise04.data.CharacterPerformance;
import exercises.week10.exercise04.reader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterReader {
    public List<CharacterPerformance> getPerformance() {
        return new FileReader().asList("exercises/week10/exercise04/refrence/got-characters.csv").stream()
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new CharacterPerformance(
                        s[0],
                        s[1],
                        s[2],
                        s[3],
                        s[4],
                        s[5],
                        s[6],
                        s[7],
                        s[8],
                        s[9],
                        s[10],
                        s[11],
                        s[12]
                ))
                .collect(Collectors.toList());
    }
}
