package exercise.week4.ex8;

import java.util.Optional;

public class AdvancedGiftApplication {

    public static void main(String[] args) {
        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);
        Box robotoy = new Box("Robotoy");
        giftBox = Optional.of(robotoy);
        System.out.println("Gift: " + giftBox);
        if (giftBox.isPresent()) {
            System.out.println("There is a present in the gift box");
        }
        Box present = giftBox.get();
        System.out.println("The gift is a " + present);
    }

}
