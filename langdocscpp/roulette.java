package langdocscpp;

import java.util.*;

public class roulette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> w = Arrays.asList(
            "0 Green", "00 Green", "1 Red", "2 Black", "3 Red", "4 Black", "5 Red", "6 Black",
            "7 Red", "8 Black", "9 Red", "10 Black", "11 Black", "12 Red", "13 Black", "14 Red",
            "15 Black", "16 Red", "17 Black", "18 Red", "19 Red", "20 Black", "21 Red", "22 Black",
            "23 Red", "24 Black", "25 Red", "26 Black", "27 Red", "28 Black", "29 Black", "30 Red",
            "31 Black", "32 Red", "33 Black", "34 Red", "35 Black", "36 Red"
        );
        
        int bal = 1000;
        Random r = new Random();
        
        while (bal > 0) {
            System.out.println("Your balance: $" + bal);
            System.out.print("Enter bet amount (or type 0 to cash out): ");
            int b = sc.nextInt();
            
            if (b == 0) {
                System.out.println("You cashed out with $" + bal + ". Thanks for playing!");
            }
            
            if (b > bal || b <= 0) {
                System.out.println("Invalid bet. Try again.");
            }
            
            System.out.print("Bet on (Red/Black/Green): ");
            String c = sc.next().toLowerCase();
            
            String s = w.get(r.nextInt(w.size()));
            System.out.println("Wheel landed on: " + s);
            
            if ((c.equals("red") && s.contains("Red")) ||
                (c.equals("black") && s.contains("Black")) ||
                (c.equals("green") && s.contains("Green"))) {
                int win = c.equals("green") ? b * 14 : b * 2;
                bal += win;
                System.out.println("You win! New balance: $" + bal);
            } else {
                bal -= b;
                System.out.println("You lose. New balance: $" + bal);
            }
        }
        
        if (bal == 0) {
            System.out.println("Game over! You ran out of money.");
        }
    }
}
