import java.util.Random;
import java.util.Scanner;

public class lp49 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(20) + 1;

        System.out.print("Guess a number between 1 and 20: ");
        int playerGuess = scanner.nextInt();

        if (playerGuess == secretNumber) {
            System.out.println("You win! The correct number was " + secretNumber + ".");
        } else {
            System.out.println("You lose. The correct number was " + secretNumber + ".");
        }
    }
}
