import java.io.*;
import java.util.*;

public class prog703s {
public static void main(String[] args) throws IOException {
    ArrayList<Computer> computers = new ArrayList<>();
    Scanner input = new Scanner(new File("Langdat/prog703s.txt"));
    String line;                                           
    while ((line = input.nextLine()) != null) {        
        String[] parts = line.split(",");                  
        int type = Integer.parseInt(parts[0]);         
        if (type == 1) { String name = parts[1];           
            int number = Integer.parseInt(parts[2]);   
            double value = Double.parseDouble(parts[3]);   
            String color = parts[4];
            computers.add(new Apple(name, number, value, color));
        } else if (type == 2) {
            String name = parts[1];
            int number = Integer.parseInt(parts[2]);
            double value = Double.parseDouble(parts[3]);
            double version = Double.parseDouble(parts[4]);
            computers.add(new Windows(name, number, value, version));
        } else {
            String name = parts[1];
            int number = Integer.parseInt(parts[2]);
            double value = Double.parseDouble(parts[3]);
            int secretCode = Integer.parseInt(parts[4]);
            computers.add(new Linux(name, number, value, secretCode));
        }
    }
    int grnGoldCnt = 0;
    int windows7Cnt = 0;
    int lasex5 = 0;

    for (Computer computer : computers) {
        if (computer instanceof Apple) {
            Apple apple = (Apple) computer;
            if (apple.getColor().equals("Green") || apple.getColor().equals("Gold")) 
                grnGoldCnt++;   
        } else if (computer instanceof Windows) {
            Windows windows = (Windows) computer; 
            if (windows.getVersion() == 7) 
                windows7Cnt++;
        } else if (computer instanceof Linux) {
            Linux linux = (Linux) computer;
            if (linux.getSecretCode() % 10 == 4) 
                lasex5++; 
        }
    }

    System.out.println("Number of Green or Gold Apple computers: " + grnGoldCnt);
    System.out.println("Number of Windows machines on version 7: " + windows7Cnt);
    System.out.println("Number of Linux machines with a secret code ending in 5: " + lasex5);
}
}

//catch (IOException e) {
    //System.out.println("Can't find data file!");