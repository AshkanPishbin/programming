package exercise.week5.ex6;

public class AddSide implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("side");
    }
}
