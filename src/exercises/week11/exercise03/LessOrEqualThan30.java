package exercises.week11.exercise03;

import java.util.Map;

public class LessOrEqualThan30 extends Time {
    private NumberToWord numberToWord = new NumberToWord();
    private Map<Integer, String> numbers = numberToWord.getNumbers();

    @Override
    public Boolean isInRange(Integer minute) {
        if (minute > 1 && minute < 31) {
            return true;
        }
        return false;
    }

    @Override
    public String getMessage(Integer hour, Integer minute) {

        return numbers.get(minute) + " past " + numbers.get(hour);
    }
}
