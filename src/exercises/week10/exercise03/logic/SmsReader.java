package exercises.week10.exercise03.logic;

import exercises.week10.exercise03.data.SmsPerformance;
import exercises.week10.exercise03.reader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {
    public List<SmsPerformance> getPerformance() {
        return new FileReader().asList("exercises/week10/exercise03/resource/sms.csv").stream()
                .skip(1)
                .map(s -> s.split(";"))
                .map(s-> new SmsPerformance(s[0],s[1]))
                .collect(Collectors.toList());
    }
}
