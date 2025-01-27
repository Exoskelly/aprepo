import java.io.File;                                                                                        
import java.io.IOException; 
import java.util.Scanner; 

public class prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));
            
            System.out.println("Enter the number of rows and columns:"); 
            
            int r = file.nextInt();
            int c = file.nextInt();
            int[][] mat = new int[r][c];
            
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < r; i++) 
                for (int j =0; j <  c; j++) 
                    mat[i][j] = file.nextInt();
            System.out.println("Original matrix:");
            for (int i =0; i < r; i++)
                for (int j = 0; j < c; j++)
                    mat[i][j] = file.nextInt(); 
            System.out.println("Original Matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    System.out.print(mat[i][j] + "\t");
                System.out.println();
            int sum = 0;
            for (int j =0; j < c; j++) 
                sum += mat[0][j];
            if (r > 1) 
                for (int j = 0; j < c; j++)
                    sum += mat[r - 1][j];
            for (i = 1; i < r - 1; i++) {
                sum += mat[i][0];
                sum += mat[i][c - 1];
            }
            System.out.println("The total of the edges is " + sum + ".");
    } 
    } catch(IOException e) {
        System.out.println("Error: " + e);
    }
    }
    }