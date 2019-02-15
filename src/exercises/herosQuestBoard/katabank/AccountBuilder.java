package exercises.herosQuestBoard.katabank;

import java.util.ArrayList;
import java.util.List;

public class AccountBuilder {

    private DigitTranslator translator = new DigitTranslator();

    public Account from(Line line) {
        List<Integer> numbers = toNumbers(line);
        return new Account(numbers);
    }

    private List<Integer> toNumbers(Line line) {
        List<Integer> digits = new ArrayList<>();
        DigitIterator iterator = new DigitIterator(line);
        while (iterator.hasNext()) {
            addOneDigit(digits, iterator);
        }
        return digits;
    }

    private void addOneDigit(List<Integer> digits, DigitIterator iterator) {
        Digit digit = iterator.next();
        Integer number = translator.toNumber(digit);
        digits.add(number);
    }

}
