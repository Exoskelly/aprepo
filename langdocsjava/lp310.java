import java.util.Scanner;

public class lp310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BURGER_PRICE = 1.69;
        final double FRIES_PRICE = 1.09;
        final double SODA_PRICE = 0.99;
        final double TAX_RATE = 0.065;

        System.out.print("Enter the number of burgers: ");
        int burgers = scanner.nextInt();

        System.out.print("Enter the number of fries: ");
        int fries = scanner.nextInt();

        System.out.print("Enter the number of sodas: ");
        int sodas = scanner.nextInt();

        double totalBeforeTax = (burgers * BURGER_PRICE) + (fries * FRIES_PRICE) + (sodas * SODA_PRICE);
        double tax = totalBeforeTax * TAX_RATE;
        double finalTotal = totalBeforeTax + tax;

        System.out.printf("Total before tax: $%.2f\n", totalBeforeTax);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Final total: $%.2f\n", finalTotal);

        System.out.print("Enter amount tendered: $");
        double amountTendered = scanner.nextDouble();

        double change = amountTendered - finalTotal;
        System.out.printf("Change: $%.2f\n", change);
    }
}
