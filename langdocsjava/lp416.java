import java.util.Scanner;

public class lp416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double degrees = scanner.nextDouble();

        double radians = Math.toRadians(degrees);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        System.out.printf("Sine: %.3f%n", sine);
        System.out.printf("Cosine: %.3f%n", cosine);
        System.out.printf("Tangent: %.3f%n", tangent);
    }
}
