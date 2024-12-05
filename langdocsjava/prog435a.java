import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prog435a {

    public static void main(String[] args) {
        String[] carTypes = {"Compact Car", "Small Car", "Mid Size Car", "Full Size Car", "Truck", "16 Wheeler"};
        double[] factors = {1.0, 1.3, 1.6, 2.0, 2.4, 2.7};
        double[] tolls = {1.35, 2.00, 2.50, 3.25, 4.10, 4.87, 5.50, 6.00};

        try (Scanner scanner = new Scanner(new File("prog435a.dat"))) {
            System.out.printf("%-15s %-10s %-8s %s%n", "Car Type", "Base Toll", "Factor", "Cost");
            System.out.println("----------------------------------------------------");

            while (scanner.hasNextInt()) {
                int vehicleType = scanner.nextInt();
                int gateNumber = scanner.nextInt();

                String carType = carTypes[vehicleType - 1];
                double factor = factors[vehicleType - 1];
                double baseToll = tolls[gateNumber - 1];
                double cost = factor * baseToll;

                System.out.printf("%-15s $%-9.2f %-8.2f $%.2f%n", carType, baseToll, factor, cost);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
    }
}