import java.util.*;

public class strint6array {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = kbd.nextLine().toUpperCase();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] count = new int[26];

        for (int j = 0; j < str.length(); j++)
            for (int k = 0; k < abc.length(); k++)
                if (str.substring(j, j+1).equals(abc.substring(k, k+1)))
                    count[k]++;

        int unique = 0;
        for (int n : count)
            if (n > 0) unique++;
        System.out.println("Unique letters: " + unique);
    }
}
