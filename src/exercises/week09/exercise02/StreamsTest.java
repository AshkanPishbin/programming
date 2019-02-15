package exercises.week09.exercise02;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    private List<String> names = new FileReader().asList("exercises/week09/exercise02/names.txt");

    @Test
    void test() {
        List<String> shortNames = names.stream()
                .filter(name -> name.length() < 4)
                .collect(Collectors.toList());
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("El"));
        Assertions.assertEquals(expected, shortNames);

        List<String> endWithM = names.stream()
                .filter(name -> name.endsWith("m"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        expected = new ArrayList<>(Arrays.asList("HOSAM", "TAMMAM"));
        Assertions.assertEquals(expected, endWithM);

        List<String> contain = names.stream()
                .filter(name -> name.contains("e"))
                .filter(name -> name.contains("r"))
                .collect(Collectors.toList());
        expected = new ArrayList<>(Arrays.asList("Mehran", "Norbert", "Serife"));
        Assertions.assertEquals(expected, contain);

        List<String> collect = names.stream()
                .filter(name -> name.length() == 4)
                .map(name -> name.toLowerCase())
                .filter(name -> name.contains("a"))
                .filter(name -> name.contains("m"))
                .map(name -> name.replace("a", "aa"))
                .peek(name -> System.out.println(name))
                .collect(Collectors.toList());
        expected = new ArrayList<>(Arrays.asList("maarj", "aamin", "omaar"));
        Assertions.assertEquals(expected, collect);


    }


}
