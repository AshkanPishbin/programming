package exercises.week11.exercise03;

import java.util.Map;

public class Oclock extends Time {
    private NumberToWord numberToWord = new NumberToWord();
    private Map<Integer, String> numbers = numberToWord.getNumbers();

    @Override
    public Boolean isInRange(Integer minute) {
        return minute.equals(0);
    }

    @Override
    public String getMessage(Integer hour, Integer minute) {
        if (hour.equals(0) || hour.equals(24)){
            return "midnight";
        }
    return numbers.get(hour);

    }
}
