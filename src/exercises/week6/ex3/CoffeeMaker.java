package exercise.week6.ex3;

public abstract class CoffeeMaker {

    protected abstract String getName();

    protected abstract Integer getBrewingTime();

    public Coffee brew() {
        String madeBy = getName();
        Integer brewingTime = getBrewingTime();
        return new Coffee(madeBy, brewingTime);
    }

}