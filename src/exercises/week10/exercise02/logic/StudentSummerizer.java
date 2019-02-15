package exercises.week10.exercise02.logic;

import exercises.week10.exercise02.data.AverageData;
import exercises.week10.exercise02.data.StudentsPerformance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentSummerizer {
    List<StudentsPerformance> studentsPerformances = new exercises.week10.exercise02.logic.PerformanceReader().getPerformance();

    public Map<String, Long> displayParentEducationLevelAppearances() {
        return studentsPerformances.stream()
                .map(s -> s.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

    public List<String> displayParentEducationLevelAppearancesSortedTopBottom() {
        return displayParentEducationLevelAppearances()
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey() + "|" + entry.getValue())
                .collect(Collectors.toList());
    }

    public Long displayhighParentEducationAndLowerScoresThan60() {
        return studentsPerformances.stream()
                .filter(s -> s.getParentalLevelOfEducation().equals("master's degree"))
                .filter(s -> s.getMathScore() < 60)
                .filter(s -> s.getReadingScore() < 60)
                .filter(s -> s.getWritingScore() < 60)
                .count();
    }

    public List<String> displayFourTopGendersAndAverageScores() {
        return studentsPerformances.stream()
                .map(e -> new AverageData(e.getGender(), averageNumber(e)))
                .sorted((e1, e2) -> e2.getAvrage().compareTo(e1.getAvrage()))
                .map(AverageData::toString)
                .limit(4)
                .collect(Collectors.toList());
    }

    private Integer averageNumber(StudentsPerformance e) {
        return (e.getReadingScore() + e.getMathScore() + e.getWritingScore()) / 3;

    }

    public Boolean displayIsAnyStudentWithAParentEducationLevelOfSomeHighSchool() {
        return studentsPerformances.stream()
                .filter(e -> e.getWritingScore() >= 97)
                .filter(e -> e.getReadingScore() >= 97)
                .filter(e -> e.getMathScore() >= 97)
                .anyMatch(e -> e.getParentalLevelOfEducation().equals("some high school"));
    }
}
