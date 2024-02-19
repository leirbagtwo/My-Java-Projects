package mp5;
import java.util.Scanner;
/**
 @author Gabriel
 */
public class DieMain {
    public static int getRollValue() {

    Die die = new Die();
    int roll1Value = die.getValue();
    die.roll();
    int roll2Value = die.getValue();
    return roll1Value + roll2Value;
    }
    public static boolean isUnderGameLimit(int value) {
        return value <= 21;
    }
    public static boolean playAgain() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Roll the dice? (y/n) : ");
        String userResponse = keyboard.nextLine();
        char letter = userResponse.charAt(0); 
        return letter == 'Y' || letter == 'y';
    }

    public static void displayResults(int computerScore, int userScore) {
        System.out.println("\nGame Over\n");
        System.out.println("User's Points: " + userScore);
        System.out.println("Computer's Points: " + computerScore);
        System.out.println(getWinnerMessage(computerScore, userScore));
    }

    public static String getWinnerMessage(int computerScore, int userScore) {
        if (userScore > computerScore && isUnderGameLimit(userScore)) {
            return "Congrats, you win!!!";
        } else if (isUnderGameLimit(userScore)
                && !isUnderGameLimit(computerScore)) {
            return "Congrats, you win!!!";
        } else if (userScore == 21 && computerScore != 21) {
            return "Congrats, you win!!!";
        } else if (userScore == computerScore) {
            return "Tie game!";
        } else if (!isUnderGameLimit(userScore)
                && !isUnderGameLimit(computerScore)) {
            return "This game has ended without a winner.";
        } else {
            return "The computer wins!";
        }
    }
    public static void main(String[] args) {
        int computerPoints = 0;
        int userPoints = 0;

        while (playAgain()) {
            computerPoints += getRollValue();
            userPoints += getRollValue();

        if (!isUnderGameLimit(userPoints)|| !isUnderGameLimit(computerPoints)) {
                break;
            }
            System.out.println("User Points: " + userPoints);
        }

        if (userPoints == 0 && computerPoints == 0) {
            System.out.println("Gotta play to win!!!");
        } else {
            displayResults(computerPoints, userPoints);
        }
    }
}
