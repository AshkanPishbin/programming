package exercises.week5.ex4;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {

    public static void main(String[] args) {
        SuperheroCaller caller = new SuperheroCaller();
        Superhero superhero = caller.call();
        System.out.println("Superhero: " + superhero.getName());

        List<Superhero> superheroes = new ArrayList<>();
        for (int times = 0; times < 6; times++) {
            Superhero hero = caller.call();
            superheroes.add(hero);
            System.out.println("Superhero " + (times + 1) + ": " + hero.getName());
        }

        System.out.println("Number of superheroes: " + superheroes.size());
    }
}
