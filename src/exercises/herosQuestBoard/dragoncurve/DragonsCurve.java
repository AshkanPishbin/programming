package exercises.herosQuestBoard.dragoncurve;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class DragonsCurve {
    public IntFunction<String> mapFunction = getMapFunction(); //Make the function; map the chars to Strings

    private IntFunction<String> getMapFunction() {
        return ascii -> {
            if (ascii == 'a') {
                return "aRbFR";
            }
            if (ascii == 'b') {
                return "LFaLb";
            }
            return Character.toString((char) ascii);
        };
    }
    //a -> aRbFR, b -> LFaLb, otherwise -> itself

    /**
     * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
     * Then remove the a and b (createFilter function is useful for that)
     */
    public String createCurve(int n) {
        //"Fa".chars(); //That's an IntStream with 'F' and 'a' ready to be acted upon
        return curve("Fa", n);
    }

    private String curve(String text, int iteration) {
        System.out.println("Original: " + text);
        boolean isLastIteration = iteration == 0;
        String result = text.chars()
                .filter(createFilter('a', !isLastIteration))
                .filter(createFilter('b', !isLastIteration))
                .mapToObj(getMapFunction())
                .collect(Collectors.joining());
        System.out.println("Calculated: " + result);
        if (isLastIteration) {
            return result;
        }
        return curve(result, iteration - 1);
    }


    /**
     * How many of the specified char are in the given curve?
     * Hint: createFilter could be useful for this
     */
    public long howMany(char c, String curve) {
//        return 4L; //Determined by die roll; guaranteed to be random
        return curve.chars()
                .filter(e -> e == c)
                .count();
    }

    /**
     * Create a predicate to filter the specified char; keep or remove based on keep variable
     */
    public IntPredicate createFilter(char filterWhat, boolean keep) {
        return ascii -> keep || ascii != filterWhat;
    }
}