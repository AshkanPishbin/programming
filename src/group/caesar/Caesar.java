package group.caesar;

import java.util.Arrays;
import java.util.List;

public class Caesar {

    private static final Integer NUMBER_OF_LETTERS = 26;
    private static final Integer UPPERCASE_SHIFT = 65;
    private static final Integer LOWERCASE_SHIFT = 97;

    private LetterHandler letterHandler = new LetterHandler();

    public String encrypt(String plaintext, Integer key) {
        List<String> letters = getLetters(plaintext);
        String ciphertext = "";
        for (String letter : letters) {
            ciphertext += encryptLetter(letter, key);
        }
        return ciphertext;
    }

    private List<String> getLetters(String plaintext) {
        String[] split = plaintext.split("");
        return Arrays.asList(split);
    }

    private String encryptLetter(String letter, Integer key) {
        int ascii = letterHandler.toAscii(letter);
        if (letter.isEmpty() || !Character.isAlphabetic(ascii)) {
            return letter;
        }
        int shift = getShift(ascii);
        ascii -= shift;
        ascii += key;
        ascii %= NUMBER_OF_LETTERS;
        ascii += shift;
        return letterHandler.toLetter(ascii);
    }

    private int getShift(int ascii) {
        if (Character.isUpperCase(ascii)) {
            return UPPERCASE_SHIFT;
        }
        return LOWERCASE_SHIFT;
    }
}
