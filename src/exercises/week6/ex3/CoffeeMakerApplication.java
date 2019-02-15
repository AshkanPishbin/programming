package exercise.week6.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {

    public static void main(String[] args) {
        List<CoffeeMaker> makers = CoffeeMakers.asList();
        for (CoffeeMaker maker : makers) {
            Coffee coffee = maker.brew();
            display(coffee);
        }

        List<String> names = Arrays.asList("Automatic coffee machine", "French press", "Auto drip");
        for (String name : names) {
            displayBrewedCoffeeWithCoffeeMaker(name);
        }

        String name = "Moka pot";
        Optional<CoffeeMaker> maker = CoffeeMakers.get(name);
        if (!maker.isPresent()) {
            System.out.println("The coffee maker with the name " + name + " is not available");
        }
    }

    private static void display(Coffee coffee) {
        System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
    }

    private static void displayBrewedCoffeeWithCoffeeMaker(String name) {
        Optional<CoffeeMaker> maker = CoffeeMakers.get(name);
        if (maker.isPresent()) {
            Coffee coffee = maker.get().brew();
            display(coffee);
        }
    }

}
