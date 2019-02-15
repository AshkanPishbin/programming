package group.caesar;

import java.util.Scanner;

public class CaesarApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, provide a key: ");
        int key = Integer.valueOf(scanner.next());
        System.out.print("Please, provide the plaintext: ");
        String plaintext = scanner.nextLine();

        Caesar caesar = new Caesar();

        String ciphertext = caesar.encrypt(plaintext, key);

        System.out.println("Key: " + key);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}
