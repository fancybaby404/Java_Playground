package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);

        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);

        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Julian", highScorePosition);

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Martin", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Charles", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Marley", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Charlie", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int positionHighScoreTable) {
        System.out.println(playerName + " managed to get into position " + positionHighScoreTable);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
