import java.util.Scanner;

public class prog465b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] numbers = new int[3][4];
    
        int[][] rowCol = new int[12][2]; 
        
        int rowColIndex = 0; 
        System.out.println("Enter 12 numbers for the 3x4 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = scanner.nextInt();
                if (numbers[i][j] < 100) {
                    rowCol[rowColIndex][0] = i + 1; 
                    rowCol[rowColIndex][1] = j + 1; 
                    rowColIndex++;
                }
            }
        }
        System.out.println("Original table:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Numbers Less Than 100");
        System.out.println("Row\tColumn");
        for (int i = 0; i < rowColIndex; i++) {
            System.out.println(rowCol[i][0] + "\t" + rowCol[i][1]);
        }
        
        scanner.close();
    }
}

 //  1 2  3  4 5
 //  2 3  4  5 6
 //  3 4  5  6 7
 //  4 5  6  7 8
 //  5 6  7  8 9 