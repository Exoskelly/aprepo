package langdocscpp;

import java.util.Scanner;

public class msoe20092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radEarth = 3963.1; 
        System.out.print("Enter your current latitude: ");
        double lat1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Enter your current longitude: ");
        double lon1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Enter your car's latitude: ");
        double lat2 = Math.toRadians(scanner.nextDouble());
        System.out.print("Enter your car's longitude: ");
        double lon2 = Math.toRadians(scanner.nextDouble());
        double d = radEarth * Math.acos(Math.cos(lon2 - lon1) * Math.cos(lat2) * Math.cos(lat1) + Math.sin(lat2) * Math.sin(lat1));
        System.out.printf("Approximate distance to yourcar: .%3f miles%n", d);
    }
}
