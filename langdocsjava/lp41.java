import java.util.Scanner;

public class lp41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of copies: ");
        int copies = scanner.nextInt();
        double cost = 0;

        if (copies >= 0 && copies < 100) {
            cost = copies * 0.30;
        } else if (copies >= 100 && copies < 500) {
            cost = copies * 0.28;
        } else if (copies >= 500 && copies < 750) {
            cost = copies * 0.27;
        } else if (copies >= 750 && copies <= 1000) {
            cost = copies * 0.26;
        } else if (copies > 1000) {
            cost = copies * 0.25;
        }

        System.out.printf("Total cost: $%.2f%n", cost);
    }
}
