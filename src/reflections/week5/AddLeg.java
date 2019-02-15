package reflections.week5;

import exercises.week5.ex6.Furniture;
import exercises.week5.ex6.Step;

public class AddLeg implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }
}
