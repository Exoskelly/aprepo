import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prog214b {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("prog214b.dat"))) {
            
            while (scanner.hasNext()) {
                int empId = scanner.nextInt();
                double yearToDatePay = scanner.nextDouble();
                double basePayRate = scanner.nextDouble();
                double shiftFactor = scanner.nextDouble();
                double hoursWorked = scanner.nextDouble();

                double payRate = basePayRate * shiftFactor;
                double grossPay = hoursWorked * payRate;
                double withholdingTax = calculateWithholdingTax(grossPay);
                double ficaTax = calculateFicaTax(yearToDatePay, grossPay);
                double netPay = grossPay - withholdingTax - ficaTax;

                System.out.printf("Employee number %d%n", empId);
                System.out.printf("Hours %.2f  Rate %.2f  Shift Factor %.2f%n", hoursWorked, basePayRate, shiftFactor);
                System.out.printf("%-13s%-13s%-13s%n", " ", "Current", "Year-to-date");
                System.out.printf("Gross Pay    %-13.2f%-13.2f%n", grossPay, yearToDatePay);
                System.out.printf("Withholding  %-13.2f%n", withholdingTax);
                System.out.printf("FICA         %-13.2f%n", ficaTax);
                System.out.printf("Net Pay      %.2f%n%n", netPay);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static double calculateWithholdingTax(double grossPay) {
        if (grossPay < 100) return 0.0;
        else if (grossPay < 150) return grossPay * 0.08;
        else if (grossPay < 200) return grossPay * 0.12;
        else if (grossPay < 300) return grossPay * 0.15;
        else return grossPay * 0.175;
    }

    public static double calculateFicaTax(double yearToDatePay, double grossPay) {
        double ficaTaxRate = 0.0605;
        double ficaLimit = 17300.0;

        if (yearToDatePay >= ficaLimit) return 0.0;
        else if (yearToDatePay + grossPay <= ficaLimit) return grossPay * ficaTaxRate;
        else return (ficaLimit - yearToDatePay) * ficaTaxRate;
    }
}
