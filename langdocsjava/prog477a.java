import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        int[][] gradeCounts = new int[5][2];
        try {
            Scanner reader = new Scanner(new File("Langdat/prog477a.dat"));
            String line;
            while ((line = reader.nextLine()) != null) {
                String[] data = line.split(" ");
                int sex = Integer.parseInt(data[0]);
                int grade = Integer.parseInt(data[1]); 
                
                if (sex == 1) {
                    gradeCounts[grade - 1][0]++;
                } else if (sex == 2) {
                    gradeCounts[grade - 1][1]++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
        System.out.println("Grade\tMale\tFemale\tTotal");
        
        int totalMales = 0;
        int totalFemales = 0;
        int grandTotal = 0;
        
        for (int i = 0; i < 5; i++) {
            int maleCount = gradeCounts[i][0];
            int femaleCount = gradeCounts[i][1];
            int totalForGrade = maleCount + femaleCount;
            
            totalMales += maleCount;
            totalFemales += femaleCount;
            grandTotal += totalForGrade;
            
            char gradeLetter = (char) ('A' + i); 
            System.out.printf("%c\t%d\t%d\t%d\n", gradeLetter, maleCount, femaleCount, totalForGrade);
        }
        
        System.out.printf("_____________________________\n");
        System.out.printf("Totals\t%d\t%d\t%d\n", totalMales, totalFemales, grandTotal);
    }
}