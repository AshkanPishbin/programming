package exercises.herosQuestBoard.katabank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {

    private List<Integer> digits;
    private Integer number;

    public Account(List<Integer> digits) {
        this.digits = digits;
        number = collapse(digits);
    }

    private Integer collapse(List<Integer> digits) {
        List<Integer> reversed = new ArrayList<>(digits);
        Collections.reverse(reversed);
        int number = 0;
        int factor = 1;
        for (Integer digit : reversed) {
            number += digit * factor;
            factor *= 10;
        }
        return number;
    }

    public List<Integer> getDigits() {
        return new ArrayList<>(digits);
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
