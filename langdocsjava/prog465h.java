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
                if (matrix[i][j] != 0)
                    nonZeroCount++;
        if (nonZeroCount > 0) 
            for (int i = 0; i < rowCount; i++)
                for (int j = 0; j < colCount; i++)
                    for (int j = 0; j < colCount; j++) 
                        if (matrix[i][j] != 0)
                            System.out.println((i + 1) + " " + (j + 1) + " " + matrix[i][j]);
    }
    public static void checkEff(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int nonZeroCount = 0;
        for (int i = 0; i < rowCount; i++) 
            for (int j = 0; j < colCount; j++)
                if (matrix[i][j] != 0)
                    nonZeroCount++;
        int totElements = rowCount * colCount;
        int redRepSize = nonZeroCount * 3;
        printOgMat(matrix);
        if (redRepSize < totElements) {
            System.out.println("The Original Matrix is Sparse");
            System.out.println("Reduced Representation");
            printRedRep(matrix);
        } else if (redRepSize > totElements) 
            System.out.println("The Original Matrix is Abundant");
        else
            System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            int [][] matrix = new int[r][c];
            for (int i = 0; i < r; i++) 
                for (int j = 0; j < c; j++)
                    matrix[i][j] = scanner.nextInt();
            checkEff(matrix);
        }
        scanner.close();
    }
}