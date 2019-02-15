package exercise.week5.ex4;

import exercise.week5.ex5.Villain;

public class Superman implements Superhero {

    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }
}
