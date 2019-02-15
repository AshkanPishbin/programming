package exercise.week3.ex2;

import exercise.week3.ex1.Customer;

public class TemplateChooser {

    public String chooseTemplate(Customer customer) {
        if (isPrivilegedTemplate(customer)) {
            return "privileged";
        }
        if (isManTemplate(customer)) {
            return "man";
        }
        if (isWomanTemplate(customer)) {
            return "woman";
        }
        return "default";
    }

    private Boolean isManTemplate(Customer customer) {
        return customer.getName().trim().startsWith("Mr.");
    }

    private Boolean isWomanTemplate(Customer customer) {
        return (customer.getName().trim().startsWith("Ms.") || customer.getName().trim().startsWith("Mrs."));
    }

    private Boolean isPrivilegedTemplate(Customer customer) {
        return customer.getName().contains("Hokopoko");
    }

}
