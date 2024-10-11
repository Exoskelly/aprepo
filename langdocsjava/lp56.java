import java.util.Scanner;

public class lp56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String input = scanner.nextLine();

        if (input.matches("\\d+")) {
            int sum = 0;
            for (char digit : input.toCharArray()) {
                sum += Character.getNumericValue(digit);
            }
            System.out.println("The sum of the digits is: " + sum);
        } else {
            System.out.println("Please enter a valid positive integer.");
        }

        scanner.close();
    }
}
