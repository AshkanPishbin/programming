package exercises.herosQuestBoard.katabank;


public class DigitIterator {

    private static final Integer DIGIT_SIZE = 3;

    private Line line;
    private Integer position = 0;

    public DigitIterator(Line line) {
        this.line = line;
    }

    public boolean hasNext() {
        int lineLength = line.getPart1().length();
        return position + DIGIT_SIZE <= lineLength;
    }

    public Digit next() {
        String part1 = line.getPart1().substring(position, position + DIGIT_SIZE);
        String part2 = line.getPart2().substring(position, position + DIGIT_SIZE);
        String part3 = line.getPart3().substring(position, position + DIGIT_SIZE);
        position += DIGIT_SIZE;
        return new Digit(part1, part2, part3);
    }
}
