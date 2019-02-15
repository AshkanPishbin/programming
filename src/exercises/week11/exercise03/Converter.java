package exercises.week11.exercise03;

import java.util.List;

public class Converter {
    private Times time = new Times();
    private List<Time> times = this.time.getTimes();

    public String toWord(Integer hour, Integer minute) {
        for (Time time : times) {
            if (time.isInRange(minute)) {
                return time.getMessage(hour, minute);
            }
        }
        return "Invalid time!";
    }
}
