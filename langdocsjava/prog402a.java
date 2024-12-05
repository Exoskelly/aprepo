import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prog402a {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 21;
        int[] ids = new int[NUM_STUDENTS];
        double[] scores = new double[NUM_STUDENTS];
        try (Scanner scanner = new Scanner(new File("prg402a.dat"))) {
            double totalScore = 0.0;
            
            for (int i = 0; i < NUM_STUDENTS; i++) {
                if (scanner.hasNextInt()) {
                    ids[i] = scanner.nextInt();
                    scores[i] = scanner.nextDouble();
                    totalScore += scores[i];
                }
            }
            
            double averageScore = totalScore / NUM_STUDENTS;
            System.out.printf("%-10s %-10s %-10s%n", "ID", "Score", "Diff");
            System.out.println("---------------------------------");
            
            for (int i = 0; i < NUM_STUDENTS; i++) {
                double difference = scores[i] - averageScore;
                System.out.printf("%-10d %-10.2f %-10.2f%n", ids[i], scores[i], difference);
            }
            
            System.out.printf("%nAverage Score = %.2f%n", averageScore);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
