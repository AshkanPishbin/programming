package exercises.week11.exercise03;

import java.util.Map;

public class MoreThan30 extends Time {
    private NumberToWord numberToWord = new NumberToWord();
    private Map<Integer, String> numbers = numberToWord.getNumbers();

    @Override
    public Boolean isInRange(Integer minute) {
        return minute > 30 && minute < 60;
    }

    @Override
    public String getMessage(Integer hour, Integer minute) {
        return numbers.get(60-minute) + " to " + numbers.get(hour+1);

    }
}
