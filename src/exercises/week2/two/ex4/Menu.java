package exercise.week2.two.ex4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public List<Meal> getMeals() {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("Couscous", 8.5));
        meals.add(new Meal("Tajin", 9.5));
        meals.add(new Meal("Hummus", 3.5));
        meals.add(new Meal("Falafel", 4.0));
        return meals;
    }

}
