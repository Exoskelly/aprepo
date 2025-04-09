package langdocscpp.create;

import java.util.*;

public class rouletteGame {
    public static void playRoulette() {
        Scanner scanner = new Scanner(System.in);
        List<String> wheel = rouletteLogic.getWheel();
        int balance = 1000;
        Random rand = new Random();

        while (balance > 0) {
            System.out.println("Your balance: $" + balance);
            System.out.print("Enter bet amount (or type 0 to cash out): "); // instructions for output
            int bet = scanner.nextInt(); //<-- input from user

            if (bet == 0) {
                System.out.println("You cashed out with $" + balance + ". Thanks for playing!");
                return;
            }

            if (bet > balance || bet < 0) {
                System.out.println("Invalid bet. Try again.");
                continue;
            }

            System.out.print("Bet on (Red/Black/Green): ");
            String colorBet = scanner.next().toLowerCase();

            String result = wheel.get(rand.nextInt(wheel.size()));

            System.out.println("Wheel landed on: " + result);

            balance = rouletteLogic.calculateOutcome(balance, bet, colorBet, result);
        }

        System.out.println("Game over! You ran out of money.");
    }
}