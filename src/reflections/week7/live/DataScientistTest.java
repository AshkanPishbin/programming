package reflections.week7.live;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DataScientistTest {

    private DataScientist scientist = new DataScientist();

    @Test
    void testData() {
        List<Worker> workers = getTestWorkers();
        Data data = scientist.getData(workers);

        Assertions.assertEquals(5300, data.getTotalPaid().intValue());
        Assertions.assertEquals("Cleaning", data.getMostPayingDepartment());
        String name = data.getTopSalaryWorker().getName();
        Assertions.assertEquals("Tamara", name);
    }

    private List<Worker> getTestWorkers() {
        Worker omar = new Worker("Omar", "Cleaning", 2500, "AT1234");
        Worker tamara = new Worker("Tamara", "IT", 2600, "AT1234");
        Worker rabi = new Worker("Rabi", "Cleaning", 200, "AT1234");
        return Arrays.asList(omar, tamara, rabi);
    }
}