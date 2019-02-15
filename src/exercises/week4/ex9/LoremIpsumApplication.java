package exercise.week4.ex9;

import java.util.List;

public class LoremIpsumApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("exercise/week4/ex9/lorem-ipsum.txt");
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
