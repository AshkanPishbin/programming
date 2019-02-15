package exercise.week5.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JudgeTest {

    private Judge judge = new Judge();

    @Test
    void judgePlayer1Wins() {
        Move move1 = new Rock();
        Move move2 = new Scissors();
        String result = this.judge.findWinner(move1, move2);
        Assertions.assertEquals("You win!", result);
    }

    @Test
    void judgePlayer2Wins() {
        Move move1 = new Paper();
        Move move2 = new Scissors();
        String result = this.judge.findWinner(move1, move2);
        Assertions.assertEquals("The computer wins!", result);
    }

    @Test
    void judgeNobodyWins() {
        Move move1 = new Rock();
        Move move2 = new Rock();
        String result = this.judge.findWinner(move1, move2);
        Assertions.assertEquals("Nobody wins!", result);
    }
}