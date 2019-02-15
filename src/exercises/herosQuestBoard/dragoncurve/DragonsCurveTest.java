package exercises.herosQuestBoard.dragoncurve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragonsCurveTest {
    final List<Integer> ns = Arrays.asList(0, 1, 2, 3, 5);
    final List<String> curves = Arrays.asList("F", "FRFR", "FRFRRLFLFR", "FRFRRLFLFRRLFRFRLLFLFR",
            "FRFRRLFLFRRLFRFRLLFLFRRLFRFRRLFLFRLLFRFRLLFLFRRLFRFRRLFLFRRLFRFRLLFLFRLLFRFRRLFLFRLLFRFRLLFLFR"
    );
    Map<Integer, String> tests = new HashMap<>();
    int timesUsed = 0;

    @BeforeEach
    public void setup() {
        //Why'd I bother with this instead of using a for(int i=0;i<ns.size();i++)? Because stream everything, that's why!
        IntStream.range(0, ns.size()).forEach(i -> tests.put(ns.get(i), curves.get(i))); //Poor man's zip
    }

    @Test
    public void testCreateCurve() throws Exception {
        DragonsCurve testee = new DragonsCurve();
        tests.forEach((i, s) -> assertEquals(s, testee.createCurve(i)));
        IntStream.rangeClosed(0, 5)
                .forEach(num -> System.out.println("Iteration: " + num + " | Result: " + testee.createCurve(num)));
    }

    @Test
    public void testMapFunction() throws Exception {
        DragonsCurve testee = new DragonsCurve();
        final List<Integer> ins = Arrays.asList((int) 'a', (int) 'b', (int) 'F', (int) 'R', (int) 'L');
        final List<String> outs = Arrays.asList("aRbFR", "LFaLb", "F", "R", "L");
        Map<Integer, String> inOut = new HashMap<>(ins.size());
        IntStream.range(0, ins.size()).forEach(i -> inOut.put(ins.get(i), outs.get(i))); //Poor man's zip
        inOut.forEach((i, o) -> {
            String res = testee.mapFunction.apply(i);
            assertEquals(o, res);
        });
    }

    @Test
    public void testHowMany() throws Exception {
        DragonsCurve testee = new DragonsCurve();
        final List<Long> fCounts = Arrays.asList(1L, 2L, 4L, 8L, 32L);
        final List<Long> rCounts = Arrays.asList(0L, 2L, 4L, 8L, 32L);
        final List<Long> lCounts = Arrays.asList(0L, 0L, 2L, 6L, 30L);
        for (int i = 0; i < curves.size(); i++) { //Some things are still better the old-fashioned way
            String p = curves.get(i);
            assertEquals(fCounts.get(i).longValue(), testee.howMany('F', p));
            assertEquals(rCounts.get(i).longValue(), testee.howMany('R', p));
            assertEquals(lCounts.get(i).longValue(), testee.howMany('L', p));
        }
    }
}