package exercise.week4.ex1;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {

    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        String bananas = "bananas";
        String oranges = "oranges";
        String tomatoes = "tomatoes";
        groceries.add(bananas);
        groceries.add(oranges);
        groceries.add(tomatoes);
        System.out.println("Groceries: " + groceries);
        groceries.remove("oranges");
        System.out.println("Groceries: " + groceries);
        groceries.add(tomatoes);
        groceries.add(tomatoes);
        System.out.println("Groceries: " + groceries);
        groceries.remove(2);
        System.out.println("Groceries: " + groceries);
        System.out.println("Groceries size: " + groceries.size());
    }

}
