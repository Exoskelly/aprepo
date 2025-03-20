import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog901a {
    public static void print(Scanner input) {
        String str = "";
        while (input.hasNext()) 
            str += input.nextLine() + "\n";
        System.out.println(reverseString(str));
    } 
    public static String reverseString(String str) {
        if (str.length() == 0)
            return "";
            return reverseString(str.substring(1)) + str.substring(0, 1);
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog512h.dat"));
            print(input);
        } catch (IOException e) {
            System.out.println("Error: ");
        }
    }
}