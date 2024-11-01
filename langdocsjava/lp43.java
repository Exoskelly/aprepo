import java.util.Scanner;

public class lp43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of eggs: ");
        int eggs = scanner.nextInt();

        int dozens = eggs / 12;
        int extraEggs = eggs % 12;
        double costPerDozen = 0;

        if (dozens < 4) {
            costPerDozen = 0.50;
        } else if (dozens < 6) {
            costPerDozen = 0.45;
        } else if (dozens < 11) {
            costPerDozen = 0.40;
        } else {
            costPerDozen = 0.35;
        }

        double totalCost = (dozens * costPerDozen) + (extraEggs * (costPerDozen / 12));

        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}
