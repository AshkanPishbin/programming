package group.caesar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LetterEncryptor {

    private List<String> original;
    private List<String> shifted;

    private Integer key;

    public LetterEncryptor(Integer key) {
        this.key = key;
        original = getOriginalLetters();
        shifted = getShiftedLetters();
    }

    private List<String> getOriginalLetters() {
        return Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
    }

    private List<String> getShiftedLetters() {
        ArrayList<String> shifted = new ArrayList<>(original);
        Collections.rotate(shifted, -key);
        return shifted;
    }


    public String encrypt(String letter) {
        if (!isAlphabetic(letter)) {
            return letter;
        }
        Boolean isUpperCase = isUpperCase(letter);
        Integer position = getPosition(letter.toLowerCase());
        String encrypted = this.shifted.get(position);
        if (isUpperCase) {
            return encrypted.toUpperCase();
        }
        return encrypted;
    }

    private boolean isAlphabetic(String letter) {
        return Character.isAlphabetic(letter.charAt(0));
    }

    private boolean isUpperCase(String letter) {
        return Character.isUpperCase(letter.charAt(0));
    }

    private Integer getPosition(String letter) {
        return original.indexOf(letter);
    }
}
