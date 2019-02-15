package group.caesar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caesar2 {

    public String encrypt(String plaintext, Integer key) {
        List<String> letters = getLetters(plaintext);
        List<String> encrypted = encryptLetters(letters,key);
        return String.join("", encrypted);
    }

    private List<String> getLetters(String plaintext) {
        return Arrays.asList(plaintext.split(""));
    }

    private List<String> encryptLetters(List<String> letters, Integer key) {
        LetterEncryptor encryptor = new LetterEncryptor(key);
        List<String> encrypted = new ArrayList<>();
        for (String letter : letters) {
            encrypted.add(encryptor.encrypt(letter));
        }
        return encrypted;
    }


}
