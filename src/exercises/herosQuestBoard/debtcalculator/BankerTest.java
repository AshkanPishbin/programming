package exercises.herosQuestBoard.debtcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BankerTest {

    private Banker banker = new Banker();

    @Test
    void testDisplayEven() {
        Person mohamed = new Person("Mohamed");
        mohamed.setDifference(0.0);

        String message = banker.displayOneDifference(mohamed);

        Assertions.assertEquals("Mohamed, you are even!", message);
    }

    @Test
    void testDisplayOwesMoney() {
        Person hala = new Person("Hala");
        hala.setDifference(10.0);

        String message = banker.displayOneDifference(hala);

        Assertions.assertEquals("Hala, you owe 10.0 Euro", message);
    }

    @Test
    void testDisplayIsOwedMoney() {
        Person tamara = new Person("Tamara");
        tamara.setDifference(-10.0);

        String message = banker.displayOneDifference(tamara);

        Assertions.assertEquals("Tamara, you are owed 10.0 Euro", message);
    }
}