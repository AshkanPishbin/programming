package exercises.week6.ex3;

public class FrenchPress extends CoffeeMaker {

    @Override
    protected String getName() {
        return "French press";
    }

    @Override
    protected Integer getBrewingTime() {
        return 10;
    }
}
