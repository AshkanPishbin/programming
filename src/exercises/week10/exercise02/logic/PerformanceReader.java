package exercises.week10.exercise02.logic;

import exercises.week10.exercise01.reader.FileReader;
import exercises.week10.exercise02.data.StudentsPerformance;

import java.util.List;
import java.util.stream.Collectors;

public class PerformanceReader {
    public List<StudentsPerformance> getPerformance() {
        return new FileReader().asList("exercises/week10/exercise02/resource/students-performance.csv").stream()
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new StudentsPerformance(s[0],
                        s[1],
                        Integer.valueOf(s[2]),
                        Integer.valueOf(s[3]),
                        Integer.valueOf(s[4])))
                .collect(Collectors.toList());


    }
}
