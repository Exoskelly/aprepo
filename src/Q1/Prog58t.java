package Q1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price, pay, change, rem;
        int dol = 0;
        int qua = 0;
        int dimes = 0;
        int nic = 0;
        int pen = 0;

        System.out.println("Enter price: ");
        price = input.nextDouble();
        System.out.println("Enter amount given: ");
        pay = input.nextDouble();

        rem = pay - price;

        while (rem >= 1) {
            rem -= 1;
            dol += 1;
        }
        while (rem >= .25) {
            rem -= .25;
            qua += 1;
        }
        while (rem >= .10) {
            rem -= .10;
            dimes += 1;
        }
        while (rem >= .05) {
            rem -= .05;
            nic += 1;
        }
        while (rem >= .01) {
            rem -= .01;
            pen += 1;
        }

        System.out.println("Dollars: " + dol);
        System.out.println("Quarters: " + qua);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nic);
        System.out.println("Pennies: " + pen);
    }
}
