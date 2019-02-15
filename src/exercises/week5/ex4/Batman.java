package exercise.week5.ex4;

import exercise.week5.ex5.Villain;

public class Batman implements Superhero {

    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }
}
