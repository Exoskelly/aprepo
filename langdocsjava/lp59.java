import java.util.Scanner;

public class lp59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.printf("%-10s %-10s%n", "Power", "Result");
        System.out.println("---------------------");

        for (int power = 1; power <= 6; power++) {
            double result = Math.pow(number, power);
            System.out.printf("%-10d %-10.2f%n", power, result);
        }

        scanner.close();
    }
}
