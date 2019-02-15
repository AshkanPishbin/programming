package reflections.week6.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void testManualCar() {
        Car car = new ManualCar("Audi");

        String message = car.drive();
        Assertions.assertEquals("Manual Audi", message);
    }

    @Test
    void testAutomaticCar() {
        Car car = new AutomaticCar("Audi");

        String message = car.drive();
        Assertions.assertEquals("Automatic Audi", message);
    }
}