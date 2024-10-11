import java.util.Random;

public class lp514 {
    public static void main(String[] args) {
        Random random = new Random();
        int rolls = 5;

        System.out.println("Rolling two dice " + rolls + " times:");

        for (int i = 0; i < rolls; i++) {
            int die1 = random.nextInt(6) + 1; 
            int die2 = random.nextInt(6) + 1; 
            int sum = die1 + die2; 
            System.out.println("Roll " + (i + 1) + ": " + die1 + " + " + die2 + " = " + sum);
        }
    }
}
