package exercise.week4.ex5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {

    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        Grocery bananas = new Grocery("bananas");
        Grocery oranges = new Grocery("oranges");
        Grocery tomatoes = new Grocery("tomatoes");
        groceries.add(bananas);
        groceries.add(oranges);
        groceries.add(tomatoes);
        System.out.println("Groceries: " + groceries);
        Grocery otherOranges = new Grocery("oranges");
        groceries.remove(otherOranges);
        System.out.println("Groceries: " + groceries);
        groceries.add(tomatoes);
        groceries.add(tomatoes);
        System.out.println("Groceries: " + groceries);
        groceries.remove(2);
        System.out.println("Groceries: " + groceries);
        System.out.println("Groceries size: " + groceries.size());
    }

}
