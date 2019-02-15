package exercise.week4.ex6;


import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {

    public static void main(String[] args) {
        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        Item underwear = new Item("underwear");
        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        backpack.add(toothpaste);
        backpack.add(underwear);
        backpack.add(towel);
        System.out.println("Backpack: " + backpack);
        Item anotherUnderwear = new Item("underwear");
        if (backpack.contains(anotherUnderwear)) {
            System.out.println("The backpack contains underwear");
        }
        backpack.remove(anotherUnderwear);
        System.out.println("Backpack: " + backpack);
        if (!backpack.contains(anotherUnderwear)) {
            System.out.println("The backpack no longer contains underwear");
        }
        backpack.add(towel);
        backpack.add(towel);
        System.out.println("Backpack: " + backpack);
        backpack.remove(2);
        System.out.println("Backpack: " + backpack);
        System.out.println("Backpack size: " + backpack.size());
    }

}
