package exercises.week10.exercise02.data;

import exercises.week10.exercise02.logic.StudentSummerizer;

import java.util.List;
import java.util.Map;

public class StudentsDisplay {
    private StudentSummerizer studentSummerizer = new StudentSummerizer();
    public void display(){
        System.out.println("\nParent education level appearances: ");
        Map<String, Long> stringLongMap = studentSummerizer.displayParentEducationLevelAppearances();
        System.out.println(stringLongMap);
        System.out.println("\nParent education level appearances sorted top bottom:");
        List<String> strings = studentSummerizer.displayParentEducationLevelAppearancesSortedTopBottom();
        System.out.println(strings);
        System.out.println("\nNumber of students with high parent education and lower scores than 60:");
        Long aLong = studentSummerizer.displayhighParentEducationAndLowerScoresThan60();
        System.out.println(aLong);
        System.out.println("\nGenders and average scores of the top four average score students:");
        List<String> list = studentSummerizer.displayFourTopGendersAndAverageScores();
        System.out.println("\nIs there any student with a parent education level of some high school that has at least 97 in every topic?");
        list.forEach(System.out::println);
        Boolean someHighSchool = studentSummerizer.displayIsAnyStudentWithAParentEducationLevelOfSomeHighSchool();
        System.out.println(someHighSchool);



    }

}
