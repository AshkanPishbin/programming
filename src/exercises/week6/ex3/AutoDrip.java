package exercises.week6.ex3;

public class AutoDrip extends CoffeeMaker {

    @Override
    protected String getName() {
        return "Auto drip";
    }

    @Override
    protected Integer getBrewingTime() {
        return 6;
    }
}
