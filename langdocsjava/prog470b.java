import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prog470b {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        try {
            Scanner inputfile = new Scanner(new File("Langdat/prog464a.dat"));
            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 5; j++)
                    mat[i][j] = inputfile.nextInt();
            int diagonalSum = 0;
            int diagonalSum2 = 0;
            for (int i = 0; i < 5; i++) {
                diagonalSum += mat[i][i]; 
                diagonalSum2 += mat[i][4 - i];
            }
            System.out.println("Diagonal Sum " + diagonalSum);
            System.out.println("Other diagonal Sum " + diagonalSum2);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return;
        }
    }
}