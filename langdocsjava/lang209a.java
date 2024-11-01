import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lang209a {
    public static void main(String[] args) {
        int lessThan500 = 0;
        int greaterOrEqual500 = 0;

        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < 500) {
                    lessThan500++;
                } else {
                    greaterOrEqual500++;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("Numbers less than 500: " + lessThan500);
        System.out.println("Numbers greater than or equal to 500: " + greaterOrEqual500);
    }
}
