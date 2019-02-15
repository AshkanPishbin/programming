package group.caesar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {

    private Caesar caesar = new Caesar();
    private Caesar2 caesar2 = new Caesar2();

    @Test
    void testEncryptOneWord() {
        String plaintext = "HELLO";
        String ciphertext = caesar.encrypt(plaintext, 1);
        String ciphertext2 = caesar2.encrypt(plaintext, 1);
        Assertions.assertEquals("IFMMP", ciphertext);
        Assertions.assertEquals("IFMMP", ciphertext2);
    }

    @Test
    void testEncryptSeveralWords() {
        String plaintext = "hello, world";
        String ciphertext = caesar.encrypt(plaintext, 13);
        String ciphertext2 = caesar2.encrypt(plaintext, 13);
        Assertions.assertEquals("uryyb, jbeyq", ciphertext);
        Assertions.assertEquals("uryyb, jbeyq", ciphertext2);
    }

    @Test
    void testEncryptUpperAndLowerCase() {
        String plaintext = "be sure to drink your Ovaltine";
        String ciphertext = caesar.encrypt(plaintext, 13);
        String ciphertext2 = caesar2.encrypt(plaintext, 13);
        Assertions.assertEquals("or fher gb qevax lbhe Binygvar", ciphertext);
        Assertions.assertEquals("or fher gb qevax lbhe Binygvar", ciphertext2);
    }
}