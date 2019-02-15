package exercise.week2.two.ex4;

import java.util.List;

public class Waiter {

    private Menu menu;

    public Waiter(Menu menu) {
        this.menu = menu;
    }

    public List<Meal> getMeals() {
        return menu.getMeals();
    }

    public void showPrice(String mealName) {
        List<Meal> meals = menu.getMeals();
        for (Meal meal : meals) {
            if (meal.getName().equals(mealName)) {
                System.out.println("The price of " + mealName + " is " + meal.getPrice() + " Euros");
                return;
            }
        }
    }
}
