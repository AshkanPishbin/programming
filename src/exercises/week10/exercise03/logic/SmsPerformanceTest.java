package week10.exercise03.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week10.exercise03.data.SmsPerformance;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsPerformanceTest {

    private SmsReader smsReader = new SmsReader();
    private List<SmsPerformance> performances = smsReader.getPerformance();

    @Test
    void testRatio() {
        String actual = performances.stream()
                .collect(Collectors.groupingBy(SmsPerformance::getLable, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / performances.size() + "%")
                .collect(Collectors.joining(" "));

        String expected = "ham 86% spam 13%";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMostUseHamWord() {
        Optional<String> first = performances.stream()
                .filter(e -> e.getLable().equals("ham"))
                .map(e -> e.getMessage())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();
        if (first.isPresent()) {
            first.get();
        }
        String expected = "to";
        Assertions.assertEquals(expected, first.get());
    }

    @Test
    void testMostUseHamletter() {
        String actual = performances.stream()
                .filter(e -> e.getLable().equals("ham"))
                .map(e -> e.getMessage())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Most used ham letter: " + e.getKey() + " appears " + e.getValue() + " times")
                .limit(1)
                .collect(Collectors.joining(" "));

        String expected = "Most used ham letter: e appears 26364 times";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testLongestSpamMessage() {
        Optional<Integer> actual = performances.stream()
                .filter(e -> e.getLable().equals("spam"))
                .map(SmsPerformance::getLable)
                .map(String::length)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .findFirst();

        Integer expected = 224;
        Assertions.assertEquals(expected, actual.get());
    }
}
