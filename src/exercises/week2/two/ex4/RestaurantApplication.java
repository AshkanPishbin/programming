package exercise.week2.two.ex4;

import java.util.List;

public class RestaurantApplication {

    public static void main(String[] args) {
        Waiter waiter = new Waiter(new Menu());
        List<Meal> meals = waiter.getMeals();
        for (Meal meal : meals) {
            System.out.print("Meal: " + meal.getName());
            System.out.println(" " + meal.getPrice() + " Euros");
        }
        waiter.showPrice("Hummus");
    }

}
