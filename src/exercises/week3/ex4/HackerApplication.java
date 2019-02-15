package exercises.week3.ex4;

public class HackerApplication {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        String ciphertext = messenger.send("Adib");
        System.out.println(ciphertext);
        String plaintext = messenger.receive(ciphertext);
        System.out.println(plaintext);
    }
}
