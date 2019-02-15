package exercises.week5.ex7;

public class Paper implements Move {

    @Override
    public String getName() {
        return "paper";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("rock");
    }
}
