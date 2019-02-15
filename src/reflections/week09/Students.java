package reflections.week09;

public class Students {

    private String gender;
    private String parentalLevelOfEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer WritingScore;

    public Students(String gender, String parentalLevelOfEducation, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalLevelOfEducation = parentalLevelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        WritingScore = writingScore;

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
        return WritingScore;
    }

    @Override
    public String toString() {
        return

                ", mathScore=" + mathScore +
                ", readingScore=" + readingScore +
                ", WritingScore=" + WritingScore +
                '}';
    }
}
