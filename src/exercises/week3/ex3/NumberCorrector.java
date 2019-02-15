package exercise.week3.ex3;

public class NumberCorrector {

    public Integer correct(Double number) {

        number = Math.abs(number);
        number = Math.floor(number);

        int correctNumber = number.intValue();
        return correctNumber;
    }

}
