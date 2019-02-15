package exercise.week3.ex2;


import exercise.week3.ex1.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        TemplateChooser templateChooser = new TemplateChooser();
        Customer jones = new Customer("Mr. Jones", "business");
        Customer smith = new Customer("Mrs. Smith", "economic");
        Customer hokopoko = new Customer("Mr. Hokopoko", "business");

        templateChooser.chooseTemplate(jones);
        templateChooser.chooseTemplate(smith);
        templateChooser.chooseTemplate(hokopoko);

    }
}
