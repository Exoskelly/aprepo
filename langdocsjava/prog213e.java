import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prog213e {

    public static void main(String[] args) {
        try {
            File file = new File("ages.txt");
            Scanner scanner = new Scanner(file);

            int numAges = scanner.nextInt();
            int[] ageDistribution = new int[10];
            int minAge = Integer.MAX_VALUE;
            int maxAge = Integer.MIN_VALUE;

            for (int i = 0; i < numAges; i++) {
                int age = scanner.nextInt();
                minAge = Math.min(minAge, age);
                maxAge = Math.max(maxAge, age);

                if (age <= 9) ageDistribution[0]++;
                else if (age <= 19) ageDistribution[1]++;
                else if (age <= 29) ageDistribution[2]++;
                else if (age <= 39) ageDistribution[3]++;
                else if (age <= 49) ageDistribution[4]++;
                else if (age <= 59) ageDistribution[5]++;
                else if (age <= 69) ageDistribution[6]++;
                else if (age <= 79) ageDistribution[7]++;
                else if (age <= 89) ageDistribution[8]++;
                else if (age <= 99) ageDistribution[9]++;
            }

            System.out.println("Number of Family Members:  " + numAges);
            System.out.println("Minimum Age:  " + minAge);
            System.out.println("Maximum Age:  " + maxAge);
            System.out.println();
            System.out.println("Age Distribution");

            String[] ageGroups = {
                "0–9:    ", "10–19:  ", "20–29:  ", "30–39:  ", "40–49:  ",
                "50–59:  ", "60–69:  ", "70–79:  ", "80–89:  ", "90–99:  "
            };

            for (int i = 0; i < ageDistribution.length; i++) {
                System.out.print(ageGroups[i]);
                for (int j = 0; j < ageDistribution[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
