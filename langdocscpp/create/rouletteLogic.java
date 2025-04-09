package langdocscpp.create;

import java.util.*;

public class rouletteLogic {
    public static int calculateOutcome(int balance, int bet, String colorBet, String result) {
        if ((colorBet.equals("red") && result.contains("Red")) ||
            (colorBet.equals("black") && result.contains("Black")) ||
            (colorBet.equals("green") && result.contains("Green"))) {
            
            int winnings = colorBet.equals("green") ? bet * 14 : bet * 2;
            balance += winnings;
            System.out.println("You win! New balance: $" + balance);
        } else {
            balance -= bet;
            System.out.println("You lose. New balance: $" + balance);
        }
        return balance;
    }

    public static List<String> getWheel() {
        return Arrays.asList(
            "0 Green", "00 Green", "1 Red", "2 Black", "3 Red", "4 Black", "5 Red", "6 Black",
            "7 Red", "8 Black", "9 Red", "10 Black", "11 Red", "12 Black", "13 Red", "14 Black",
            "15 Red", "16 Black", "17 Red", "18 Black", "19 Red", "20 Black", "21 Red", "22 Black",
            "23 Red", "24 Black", "25 Red", "26 Black", "27 Red", "28 Black", "29 Red", "30 Black",
            "31 Red", "32 Black", "33 Red", "34 Black", "35 Red", "36 Black"
        ); //use of at least one list ^
    }
}