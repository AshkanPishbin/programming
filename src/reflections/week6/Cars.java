package reflection.week6.easy;

import java.util.Random;

public class Cars {

    private static Random random = new Random();

    public static Car getNextCar(String brand) {
        boolean automatic = random.nextBoolean();
        if (automatic) {
            return new AutomaticCar(brand);
        }
        return new ManualCar(brand);
    }

}
