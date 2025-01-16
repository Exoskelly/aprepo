import java.io.File;                                                                                        
import java.io.IOException;                                                                                 
import java.util.Scanner;                                                                                   
                                                                                                            
public class prog470c {                                                                                     
    public static void main(String[] args) {                                                                
        try {                                                                                               
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));                          
            int[][] mat = new int[6][6];                                                                    
                                                                                                            
            for (int r = 0; r < mat.length-1; r++)                                                          
                for (int c = 0; c < mat[r].length-1; c++)                                                   
                    mat[r][c] = file.nextInt();                                                             
                                                                                                            
            System.out.println("Original Matrix:");                                                       
            for (int r = 0; r < mat.length-1; r++)                                                          
                for (int c = 0; c < mat[r].length-1; c++)                                                   
                    mat[r][c] = file.nextInt();                                                             
                System.out.println();                                                                       
            }                                                                                               
            System.out.println();                                                                           
                                                                                                            
            for (int r = 0; r < mat.length-1; r++) {                                                        
                for (int c = 0; c < mat[r].length-1;c++) {                                                  
                    mat[r][5] += mat[r][c];                                                                 
                    mat[5][c] += mat[r][c];                                                                 
                    mat[5][5] += mat[r][c];                                                                 
                }                                                                                           
            }                                                                                               
                                                                                                            
            System.out.println("With totals:");                                                           
            for (int[] row : mat) {                                                                         
                for ( int n : row)                                                                          
                    System.out.print(n + "\t");                                                             
                System.out.println();                                                                       
            }                                                                                               
        } catch (IOException e) {                                                                           
            System.out.println();                                                                           
        }                                                                                                   
                                                                                                            
        }                                                                                                   
    }                                                                                                       
}                                                                                                           
                                                                                                            