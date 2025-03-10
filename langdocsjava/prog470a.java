import java.io.File;                                                                                      
import java.io.IOException;                                                                                   
import java.util.Scanner;                                                                                     
public class prog470a {                                                                                   
    public static void main(String[] args) {                                                                                      
        try {                                                                                     
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));                                                                                    
            int[][] m = new int[6][5];                                                                                    
            int sum = 0;                                                                                      
            for (int i = 0; i < m.length-1; i++)                                                                                      
                for (int j = 0; j < m[0].length; j++)                                                                                     
                    m[i][j] = input.nextInt();                                                                                    
            for (int j = 0; j < m[0].length; j++) {                                                                                   
                for (int i = 0; i < m.length - 1; i++) {                                                                                      
                    sum += m[i][j];                                                                                   
                }                                                                                     
                m[5][j] = sum;                                                                                    
                sum = 0;                                                                                      
            }                                                                                     
            for (int[] r : m) {                                                                                   
                for (int j : r)                                                                                   
                    System.out.print(j + "\t");                                                                                   
                System.out.println();                                                                                     
            }                                                                                     
        } catch (IOException e) {                                                                                     
            System.out.println("Error: " + e);                                                                                    
        }                                                                                
    }                                                                                  
}                                                                                   