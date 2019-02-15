package week10.exercise02.data;

public class StudentsPerformance {

    private String gender;
    private String parentalLevelOfEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;


    public StudentsPerformance(String gender, String parentalLevelOfEducation, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalLevelOfEducation = parentalLevelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalLevelOfEducation() {
        return parentalLevelOfEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }


}
