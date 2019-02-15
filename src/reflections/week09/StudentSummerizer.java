package reflections.week09;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSummerizer {

    private List<Students> studentsList = new StudentReader().getStudents();

    public void displayBoysAndGirls() {
        long man = studentsList.stream()
                .filter(students -> students.getGender().equals("male"))
                .count();
        long female = studentsList.size() - man;
        System.out.println("Number of female students: " + female);
        System.out.println("Number of man students: " + man);
    }

    public void displayParentalEducationLevelsSortedAlphabetically() {
        List<String> parentalEducationLevels = studentsList.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Parental education levels sorted alphabetically: ");
        System.out.println(parentalEducationLevels);
    }

    public void displayNumberStudentsWithScoresHigherThan90() {
        long highScore = studentsList.stream()
                .filter(students -> students.getMathScore() > 90)
                .filter(students -> students.getReadingScore() > 90)
                .filter(students -> students.getWritingScore() > 90)
                .count();
        System.out.println("Number of students with scores higher than 90:");
        System.out.println(highScore);
    }

    public void displayBestStudents() {
        List<String> genderOfBestScore = studentsList.stream()
                .filter(students -> students.getMathScore() == 100)
                .filter(students -> students.getWritingScore() == 100)
                .filter(students -> students.getReadingScore() == 100)
                .map(students -> students.getGender())
                .collect(Collectors.toList());
        System.out.println("Number of students with scores equal to 100: ");
        System.out.println(genderOfBestScore.size());
        System.out.println("Genders of these students are:" + genderOfBestScore);
    }
}
