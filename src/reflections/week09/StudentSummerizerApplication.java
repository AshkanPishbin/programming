package reflections.week09;

public class StudentSummerizerApplication {
    public static void main(String[] args) {
        StudentSummerizer studentSummerizer = new StudentSummerizer();
        studentSummerizer.displayBestStudents();
        studentSummerizer.displayBoysAndGirls();
        studentSummerizer.displayNumberStudentsWithScoresHigherThan90();
        studentSummerizer.displayParentalEducationLevelsSortedAlphabetically();
    }
}
