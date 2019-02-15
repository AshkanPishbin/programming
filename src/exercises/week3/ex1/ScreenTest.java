package exercises.week3.ex1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenTest {

    Screen screen = new Screen();

    @Test
    void testEconomic() {
        Customer mrJupiter = new Customer("Mr. Jupiter", "economic");
        String mrJupiterFormat = screen.formatName(mrJupiter);
        Assertions.assertEquals("mr. jupiter", mrJupiterFormat);
    }

    @Test
    void testBusiness() {
        Customer mrJones = new Customer("Mr. Jones", "business");
        String mrJonesFormat = screen.formatName(mrJones);
        Assertions.assertEquals("MR. JONES", mrJonesFormat);
    }

}