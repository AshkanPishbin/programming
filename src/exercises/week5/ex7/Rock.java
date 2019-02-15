package exercises.week5.ex7;

public class Rock implements Move {

    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("scissors");
    }
}
