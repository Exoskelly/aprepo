package langdocscpp.create;

import java.util.*;

public class rouletteGame {
    private final Scanner scanner = new Scanner(System.in);
    private final List<String> wheel = rouletteLogic.getWheel(); 
    private int balance = 1000;
    private final Random rand = new Random();

    public void play() { 
        System.out.println("Welcome to the Roulette Game!");
        
        while (balance > 0) { 
            System.out.println("Your balance: $" + balance);
            System.out.print("Enter bet amount (or 0 to cash out): "); 
            int bet = scanner.nextInt(); 

            if (bet == 0) {
                System.out.println("You cashed out with $" + balance + ". Thanks for playing!");
                return;
            }

            if (bet < 0 || bet > balance) {
                System.out.println("Invalid bet. Try again."); 
                continue;
            }

            System.out.print("Bet on a color (Red / Black / Green): ");
            String colorBet = scanner.next().toLowerCase(); 

            if (!isValidColor(colorBet)) {
                System.out.println("Invalid color. Try again.");
                continue;
            }

            String result = wheel.get(rand.nextInt(wheel.size())); 
            System.out.println("Wheel landed on: " + result); 

            balance = rouletteLogic.calculateOutcome(balance, bet, colorBet, result); 
        }

        System.out.println("Game over! You ran out of money.");
    }

    private boolean isValidColor(String inputColor) { 
        return inputColor.equals("red") || inputColor.equals("black") || inputColor.equals("green");
    }
}