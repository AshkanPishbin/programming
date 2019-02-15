package reflections.week7.prepared;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class StatisticianTest {

    private Statistician generator = new Statistician();


    @Test
    void testStatistics() {
        List<Employee> employees = getTestEmployees();

        Statistics statistics = generator.calculate(employees);

        Long total = statistics.getTotalPaid();
        String department = statistics.getMostPayingDepartment();
        Employee employee = statistics.getMostPaidEmployee();

        Assertions.assertEquals(6500L, total.longValue());
        Assertions.assertEquals("Sales", department);
        Assertions.assertEquals("Mia", employee.getName());
    }

    private List<Employee> getTestEmployees() {
        Employee sam = new Employee("Sam", "Sales", 2000, "AT-test");
        Employee tom = new Employee("Tom", "Risk", 2200, "AT-test");
        Employee mia = new Employee("Mia", "Sales", 2300, "AT-test");
        return Arrays.asList(sam, tom, mia);
    }
}