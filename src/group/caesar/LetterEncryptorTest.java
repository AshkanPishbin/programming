package group.caesar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LetterEncryptorTest {

    @Test
    void testEncryptFirstLetter() {
        LetterEncryptor encryptor = new LetterEncryptor(1);

        String encryptedSmall = encryptor.encrypt("a");
        String encryptedBig = encryptor.encrypt("A");

        Assertions.assertEquals("b", encryptedSmall);
        Assertions.assertEquals("B", encryptedBig);
    }

    @Test
    void testEncryptLastLetter() {
        LetterEncryptor encryptor = new LetterEncryptor(1);

        String encryptedSmall = encryptor.encrypt("z");
        String encryptedBig = encryptor.encrypt("Z");

        Assertions.assertEquals("a", encryptedSmall);
        Assertions.assertEquals("A", encryptedBig);
    }

    @Test
    void testEncryptNonAlphabetic() {
        LetterEncryptor encryptor = new LetterEncryptor(1);

        String encrypted = encryptor.encrypt(" ");

        Assertions.assertEquals(" ", encrypted);
    }
}