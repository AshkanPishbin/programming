package group.caesar;

public class LetterHandler {

    public int toAscii(String letter) {
        char character = letter.charAt(0);
        int asciiCode = character;
        return asciiCode;
    }

    public String toLetter(int asciiCode) {
        char character = (char) asciiCode;
        return String.valueOf(character);
    }

}
