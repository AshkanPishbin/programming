package exercise.week3.ex4;

public class Messenger {

    private Encryptor encryptor = new Encryptor();
    private Decryptor decryptor = new Decryptor();

    public String send(String message) {
        return encryptor.encrypt(message);
    }

    public String receive(String message) {
        return decryptor.decrypt(message);
    }

}
