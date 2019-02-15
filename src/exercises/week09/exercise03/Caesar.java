package exercises.week09.exercise03;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public String cipher(String plaintext, Integer key) {

        return Stream.of(plaintext.split(""))
                .map(s -> encrypt(s, key))
                .collect(Collectors.joining());
    }

    private String encrypt(String letter, Integer key) {
        char value = letter.charAt(0);
        int editor;

        if (!Character.isAlphabetic(value)) {
            return letter;
        }

        if (Character.isUpperCase(value)) {
            editor = (value - 65 + key) % 26 + 65;
        } else {
            editor = (value - 97 + key) % 26 + 97;
        }

        return Character.valueOf((char) editor).toString();
    }
}