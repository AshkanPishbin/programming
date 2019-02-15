package exercises.week5.ex8;

public class Rock implements Move {

    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public boolean defeats(Move move) {
        return "scissors".equalsIgnoreCase(move.getName());
    }
}
