package reflection.week5;

import exercise.week5.ex6.AddShelf;
import exercise.week5.ex6.AddTop;
import exercise.week5.ex6.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    private List<Step> steps = getSteps();

    public TvTable build() {
        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }

    private List<Step> getSteps() {
        AddLeg leg = new AddLeg();
        AddTop top = new AddTop();
        AddShelf shelf = new AddShelf();
        return Arrays.asList(
                leg, leg, leg, leg,
                shelf, top
        );
    }

}
