package exercise.week8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SensorTest {

    private Sensor sensor = new Sensor();

    @Test
    void scan() {
        List<String> tricks = sensor.scan();
        Assertions.assertEquals(100, tricks.size());
    }
}