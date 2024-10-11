import java.util.Scanner;

public class lp55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String input = scanner.nextLine();

        if (input.matches("\\d+")) {
            for (char digit : input.toCharArray()) {
                System.out.println(digit);
            }
        } else {
            System.out.println("Please enter a valid positive integer.");
        }

        scanner.close();
    }
}
