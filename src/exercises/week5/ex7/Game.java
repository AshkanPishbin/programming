package exercises.week5.ex7;

public class Game {

    private Player player1 = new Human();
    private Player player2 = new Computer();
    private Judge judge = new Judge();

    public void play() {
        displayWelcomeMessage();
        boolean playersWantToPlay = true;
        while (playersWantToPlay) {
            playOneRound();
            playersWantToPlay = askPlayers();
        }
        displayGoodbyeMessage();
    }

    private void displayWelcomeMessage() {
        String moves = Moves.asString();
        System.out.println("Let’s play " + moves + "!");
    }

    private void playOneRound() {
        Move move1 = player1.choose();
        Move move2 = player2.choose();
        String result = judge.judge(move1, move2);
        System.out.println(result);
    }

    private boolean askPlayers() {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }


    private void displayGoodbyeMessage() {
        System.out.println("See you next time!");
    }
}
