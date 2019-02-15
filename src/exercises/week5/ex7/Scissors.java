package exercises.week5.ex7;

public class Scissors implements Move {

    @Override
    public String getName() {
        return "scissors";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("paper");
    }
}
