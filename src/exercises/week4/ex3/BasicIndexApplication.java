package exercise.week4.ex3;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {

    public static void main(String[] args) {
        Map<Integer, String> index = new HashMap<>();
        System.out.println("Index: " + index);
        Integer page1 = 1;
        Integer page2 = 2;
        Integer page3 = 3;
        String connecting = "connecting";
        String things = "possitive things";
        String economy = "ecologic economy";
        index.put(page3, economy);
        index.put(page2, things);
        index.put(page1, connecting);
        System.out.println("Index: " + index);
        System.out.println("Index keys: " + index.keySet());
        System.out.println("Index values: " + index.values());
        System.out.println("Index entry sets: " + index.entrySet());
        String teaching = "teaching methods";
        index.put(page1, teaching);
        System.out.println("Index: " + index);
        if (index.containsKey(page1)) {
            System.out.println("The page number 1 exists as key");
        }
        String topic = index.get(page3);
        System.out.println("The topic in page number " + page3 + " is " + topic);
        System.out.println("Index size: " + index.size());
    }

}
