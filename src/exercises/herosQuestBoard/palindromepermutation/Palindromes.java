package exercises.herosQuestBoard.palindromepermutation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindromes {

    public boolean isPalindrome(String text) {
        String noSpaces = text.replaceAll(" ", "");
        String reversed = reverse(noSpaces);
        return noSpaces.equalsIgnoreCase(reversed);
    }

    private String reverse(String noSpaces) {
        List<String> letters = Arrays.asList(noSpaces.split(""));
        Collections.reverse(letters);
        return String.join("", letters);
    }


    public boolean isPalindromePermutation(String text) {
        // split text into letters - check
        // filter out spaces - check
        // make them lowercase - check
        // count letters
        // filter evenly grouped letters
        // if odd grouped is bigger than 1 - return false
        // else return true
        return Stream.of(text.split(""))
                .filter(isNonSpace())
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(isOdd())
                .collect(Collectors.counting()) <= 1;
    }

    private Predicate<String> isNonSpace() {
        return e -> !e.equals(" ");
    }

    private Predicate<Map.Entry<String, Long>> isOdd() {
        return e -> e.getValue() % 2 != 0;
    }
}
