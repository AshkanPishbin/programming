package exercise.week4.ex2;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {

    public static void main(String[] args) {
        Set<String> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        String underwear = "underwear";
        String toothpaste = "toothpaste";
        String towel = "towel";
        backpack.add(toothpaste);
        backpack.add(underwear);
        backpack.add(towel);
        System.out.println("Backpack: " + backpack);
        if (backpack.contains("underwear")) {
            System.out.println("The backpack contains underwear");
        }
        backpack.remove("underwear");
        System.out.println("Backpack: " + backpack);
        if (!backpack.contains("underwear")) {
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
