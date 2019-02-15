package reflection.week5;

import exercise.week5.ex6.Furniture;
import exercise.week5.ex6.Step;

public class AddLeg implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }
}
