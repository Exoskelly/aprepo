import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465h {
    public static void printOgMat(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row)
                System.out.print(elem + " ");
            System.out.println();
        }
    }
    public static void printRedRep(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length; 
        int nonZeroCount = 0; 
        for (int i = 0; i < rowCount; i++)
            for (int j = 0; j < colCount; j++)
                if (matrix[i][j] != 0) {
                    nonZeroCount++;
                    System.out.println((i + 1) + " " + (j + 1) + " " + matrix[i][j]);
                }
            System.out.println("\n");
    }
    public static void checkEff(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int nonZeroCount = 0;
        for (int i = 0; i < rowCount; i++) 
            for (int j = 0; j < colCount; j++)
                if (matrix[i][j] != 0)
                    nonZeroCount++;
        int[][] mat = new int[3][nonZeroCount];
        for (int i = 0; i < rowCount; i++) 
            for (int j = 0; j < colCount; j++)
                if (matrix[i][j] != 0) {
                    mat[0][nonZeroCount] = i + 1;
                    mat[1][nonZeroCount] = j + 1;
                    mat[2][nonZeroCount] = mat[i][j];
                    System.out.println((mat[0][nonZeroCount] + " " + mat[1][nonZeroCount] + " " + mat[2][nonZeroCount]));
                }
                    
    }
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("Langdat/prog465h.dat")); 
            while (scanner.hasNext()) {
                int r = scanner.nextInt();
                int c = scanner.nextInt();
                int [][] matrix = new int[r][c];
                for (int i = 0; i < r; i++) 
                    for (int j = 0; j < c; j++)
                        matrix[i][j] = scanner.nextInt();
                checkEff(matrix);
            }
        } catch(IOException e) {
        System.out.println("Error: " + e);
    }
    }
}