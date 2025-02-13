import java.io.*;
import java.util.*;

public class prog492h {
    
    static final int GRID_SIZE = 30;

    public static void main(String[] args) throws IOException {
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];

        readInitialGrid(grid);

        printGrid(grid, 0);

        for (int gen = 1; gen <= 15; gen++) {
            grid = nextGeneration(grid);
            printGrid(grid, gen);
        }
    }

    public static void readInitialGrid(char[][] grid) throws IOException {
        Scanner sc = new Scanner(new File("Langdat/prog492h.dat"));
        for (int i = 0; i < GRID_SIZE; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = (line.charAt(j) == '*') ? '*' : ' ';
            }
        }
        sc.close();
    }

    public static void printGrid(char[][] grid, int generation) {
        System.out.println("Generation " + generation);
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] nextGeneration(char[][] currentGrid) {
        char[][] newGrid = new char[GRID_SIZE][GRID_SIZE];

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                int liveNeighbors = countLiveNeighbors(currentGrid, i, j);

                if (currentGrid[i][j] == '*' && (liveNeighbors == 2 || liveNeighbors == 3)) {
                    newGrid[i][j] = '*';  
                } else if (currentGrid[i][j] == ' ' && liveNeighbors == 3) {
                    newGrid[i][j] = '*';  
                } else {
                    newGrid[i][j] = ' ';  
                }
            }
        }
        return newGrid;
    }

    public static int countLiveNeighbors(char[][] grid, int row, int col) {
        int liveNeighbors = 0;
        
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; 

                int newRow = row + i;
                int newCol = col + j;

                if (newRow >= 0 && newRow < GRID_SIZE && newCol >= 0 && newCol < GRID_SIZE) {
                    if (grid[newRow][newCol] == '*') {
                        liveNeighbors++;
                    }
                }
            }
        }
        return liveNeighbors;
    }
}
