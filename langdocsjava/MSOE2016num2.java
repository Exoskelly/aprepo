import java.util.Scanner;

public class MSOE2016num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble(); 
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter the angle A in degrees: ");
        double angleA = scanner.nextDouble();
        scanner.close();
        double angleARadians = Math.toRadians(angleA);
        double sinC = (Math.sin(angleARadians) * c) / a;
        if (sinC < -1 || sinC > 1) {
            System.out.println("No valid solution for angle C.");
        } else {
            double angleC1 = Math.toDegrees(Math.asin(sinC));
            System.out.println("First possible angle C: " + angleC1 + "°");
            double angleC2 = 180 - angleC1;
            if (angleA + angleC2 < 180) {
                System.out.println("Second possible angle C: " + angleC2 + "°");
            }
        } //blah blah blah im sooooo bored rn istg im gonna have a full on  tweak sesh rn like im geeking out so hard rn egads!! great gatsby!! gee whillickers!! gosh golly!!
    }
}
