package Q1;
import java.util.*;

public class prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter KWH used: ");
        int kwh = input.nextInt();
        double total = kwh * .0475;

        System.out.println("Base Rate\t " + kwh + " @ $.0475\t$" + total);
        System.out.println("Surcharge\t\t$" + total / 10);
        System.out.println("City Tax\t\t$" + (total / 10 + total + total));
        System.out.println("Base Rate\t " + kwh + " @ $.0475\t$" + total);
    }
}
