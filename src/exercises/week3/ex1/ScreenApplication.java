package exercise.week3.ex1;

public class ScreenApplication {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Customer karl = new Customer("Karl", "economic");
        Customer jane = new Customer("Jane", "business");
        screen.display(karl);
        screen.display(jane);
    }
}
