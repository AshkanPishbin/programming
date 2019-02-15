package exercise.week4.ex4;

import java.util.Optional;

public class BasicGiftApplication {

    public static void main(String[] args) {
        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);
        giftBox = Optional.of("Robotoy");
        System.out.println("Gift: " + giftBox);
        if(giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }
        String present = giftBox.get();
        System.out.println("The gift is a " + present);
    }

}
