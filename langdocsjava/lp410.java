import java.util.Scanner;

public class lp410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangular prism: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangular prism: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangular prism: ");
        double height = scanner.nextDouble();
        double prismVolume = length * width * height;
        System.out.printf("The volume of the rectangular prism is: %.2f cubic units%n", prismVolume);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume of the sphere is: %.2f cubic units%n", sphereVolume);

        System.out.print("Enter the base length of the pyramid: ");
        double baseLength = scanner.nextDouble();
        System.out.print("Enter the base width of the pyramid: ");
        double baseWidth = scanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double pyramidHeight = scanner.nextDouble();
        double pyramidVolume = (baseLength * baseWidth * pyramidHeight) / 3;
        System.out.printf("The volume of the pyramid is: %.2f cubic units%n", pyramidVolume);
    }
}
