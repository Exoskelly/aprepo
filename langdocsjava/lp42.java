import java.util.Scanner;

public class lp42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the package weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the package length (in cm): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the package width (in cm): ");
        double width = scanner.nextDouble();

        System.out.print("Enter the package height (in cm): ");
        double height = scanner.nextDouble();

        double volume = length * width * height;

        boolean tooHeavy = weight > 27;
        boolean tooLarge = volume > 100000;

        if (tooHeavy && tooLarge) {
            System.out.println("Too heavy and too large.");
        } else if (tooHeavy) {
            System.out.println("Too heavy.");
        } else if (tooLarge) {
            System.out.println("Too large.");
        } else {
            System.out.println("The package meets the requirements.");
        }
    }
}
