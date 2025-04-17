package langdocscpp;

import java.util.Scanner;

public class msoe20074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first address: ");
        String adr1 = scanner.nextLine().toUpperCase();
        System.out.print("Enter second address: ");
        String adr2 = scanner.nextLine().toUpperCase();
        double[] coord1 = getCoordinates(adr1);
        double[] coord2 = getCoordinates(adr2);
        double distance = Math.sqrt(Math.pow(coord1[0] - coord2[0], 2) + Math.pow(coord1[1] - coord2[1], 2));
        System.out.printf("Distance: %.3f miles\n",distance);
    }
    public static double[] getCoordinates(String adr) {
        String[] parts = adr.split(" ");
        int nsNum = Integer.parseInt(parts[0]);
        String nsDir = parts[1];
        int ewNum = Integer.parseInt(parts[2]);
        String ewDir = parts[3];
        double x = ewDir.equals("E") ? ewNum / 1200 : - ewNum / 1200;
        double y = nsDir.equals("N") ? nsNum / 800 : - nsNum / 800;
        return new double[] {x, y};
    }
}
