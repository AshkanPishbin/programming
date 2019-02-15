package exercises.week8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExclamationStrategyTest {

    private DecryptionStrategy strategy = new ExclamationStrategy();

    @Test
    void decrypt() {
        String ciphertext = "!!!!!!test!!!!!!";
        String plaintext = strategy.decrypt(ciphertext);
        Assertions.assertEquals("test", plaintext);
    }
}