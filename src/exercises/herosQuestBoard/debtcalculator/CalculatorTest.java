package exercises.herosQuestBoard.debtcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    private static List<Person> getPeople() {
        Person hala = new Person("Hala");
        hala.setPaid(10.00);
        Person mohamed = new Person("Mohamed");
        mohamed.setPaid(20.00);
        Person tamara = new exercises.herosQuestBoard.debtcalculator.Person("Tamara");
        tamara.setPaid(30.00);
        return Arrays.asList(hala, mohamed, tamara);
    }

    @Test
    void testCalculateDifference() {
        List<Person> people = getPeople();

        calculator.calculateDifference(people);

        Person hala = people.get(0);
        Person mohamed = people.get(1);
        Person tamara = people.get(2);

        Assertions.assertEquals(new Double(10.00), hala.getDifference());
        Assertions.assertEquals(new Double(0.00), mohamed.getDifference());
        Assertions.assertEquals(new Double(-10.00), tamara.getDifference());
    }

    @Test
    void testWithNoPeople() {
        List<Person> people = new ArrayList<>();
        calculator.calculateDifference(people);

        Assertions.assertTrue(people.isEmpty());
    }
}