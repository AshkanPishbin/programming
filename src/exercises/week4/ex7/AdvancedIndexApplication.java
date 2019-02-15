package exercise.week4.ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {

    public static void main(String[] args) {
        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println("Index: " + index);
        Integer page1 = 1;
        Integer page2 = 2;
        Topic connecting = new Topic("connecting");
        Topic things = new Topic("possitive things");
        Topic economy = new Topic("ecologic economy");
        List<Topic> topics1 = new ArrayList<>();
        topics1.add(connecting);
        List<Topic> topics2 = new ArrayList<>();
        topics2.add(things);
        topics2.add(economy);
        index.put(page1, topics1);
        index.put(page2, topics2);
        System.out.println("Index: " + index);
        System.out.println("Index keys: " + index.keySet());
        System.out.println("Index values: " + index.values());
        System.out.println("Index entry sets: " + index.entrySet());
        Topic teaching = new Topic("teaching methods");
        List<Topic> stored = index.get(page1);
        stored.add(teaching);
        System.out.println("Index: " + index);
        if (index.containsKey(page1)) {
            System.out.println("The page number 1 exists as key");
        }
        List<Topic> stored2 = index.get(page2);
        System.out.println("The topics in page number " + page2 + " are " + stored2);
        System.out.println("Index size: " + index.size());
    }

}
