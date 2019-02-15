package exercises.week11.exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Times {
    public List<Time> getTimes() {
        return new ArrayList<>(Arrays.asList(
                new LessOrEqualThan30(),
                new Oclock(),
                new MoreThan30()
        ));
    }
}
