package exercises.week8.robomime;

public interface DecryptionStrategy {

    boolean isValid(String text);

    String decrypt(String text);

}
