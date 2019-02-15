package week10.exercise02.data;

public class AverageData {
    private String gender;
    private Integer Avrage;

    public AverageData(String gender, Integer avrage) {
        this.gender = gender;
        Avrage = avrage;
    }


    public String getGender() {
        return gender;
    }

    public Integer getAvrage() {
        return Avrage;
    }

    @Override
    public String toString() {
        return  gender + "\t| " + Avrage;
    }
}
