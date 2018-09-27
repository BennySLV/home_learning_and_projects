/**
 * Codewars: Kata (8KU) - Rock, Paper, Scissors Game
 *
 * This program will simulate the classic
 * Rock, Paper, Scissors game
 *
 * The game involves two or more people
 * picking one of three objects (rock, paper, scissors)
 * at random. Only two players will be used in this
 * particular program.
 *
 * The winner is determined by the following
 * rules for each object. Note that numerous
 * scenarios can be established but below are
 * the three most common scenarios.
 *
 * Rock breaks scissors
 * Scissors cut paper
 * Paper covers rock
 *
 * Other scenarios include:
 * Rock meets rock
 * Scissors meets scissors
 * Paper meets paper
 *
 * All the most recent above result in a draw
 *
 * @author Ben Silveston
 */
public class RockPaperScissorsGame {

    /**
     * Run the Rock, Paper, Scissors game
     *
     * Determine the result based
     * on all possible scenarios
     * as described above.
     *
     * @param playerOne The first player
     * @param playerTwo The second player
     */
    private static String runGame(String playerOne, String playerTwo) {
        String result;
        if((playerOne.equals("rock") && playerTwo.equals("scissors"))
                || (playerOne.equals("scissors") && playerTwo.equals("paper"))
                || (playerOne.equals("paper")) && playerTwo.equals("rock")) {
            result = "Player 1 wins!";
        }
        else if((playerOne.equals("scissors") && playerTwo.equals("rock"))
                || (playerOne.equals("paper") && playerTwo.equals("scissors"))
                || (playerOne.equals("rock")) && playerTwo.equals("paper")) {
            result = "Player 2 wins!";
        }
        else {
            result = "Draw!";
        }
        return result;
    }

    /**
     * Main method
     *
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        System.out.println(runGame("rock", "scissors"));
        System.out.println(runGame("scissors", "paper"));
        System.out.println(runGame("paper", "rock"));
        System.out.println(runGame("scissors", "rock"));
        System.out.println(runGame("paper", "scissors"));
        System.out.println(runGame("rock", "paper"));
        System.out.println(runGame("scissors", "scissors"));
        System.out.println(runGame("rock", "rock"));
        System.out.println(runGame("paper", "paper"));
    }
} 