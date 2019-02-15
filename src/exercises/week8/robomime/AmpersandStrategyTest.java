package exercise.week8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AmpersandStrategyTest {

    private DecryptionStrategy strategy = new AmpersandStrategy();

    @Test
    void decrypt() {
        String ciphertext = "&&&&&&&&tset&&&&&&&&";
        String plaintext = strategy.decrypt(ciphertext);
        Assertions.assertEquals("test", plaintext);
    }
}