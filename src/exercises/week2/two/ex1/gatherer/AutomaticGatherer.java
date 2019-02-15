package exercise.week2.two.ex1.gatherer;

import exercise.week2.two.ex1.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {

    List<Hiker> getConfirmedHikers() {
        List<Hiker> hikers = new ArrayList<>();
        hikers.add(new Hiker("Lola"));
        hikers.add(new Hiker("Tom"));
        hikers.add(new Hiker("Peter"));
        hikers.add(new Hiker("Maria"));
        hikers.add(new Hiker("Samantha"));
        return hikers;
    }

}
