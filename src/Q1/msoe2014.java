package Q1;
import java.util.*;

public class msoe2014 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = kbd.nextLine();
        word = word.toLowerCase();
        int dblcnt = 0;

        for (int lcv = 0; lcv < word.length() - 1; lcv++){
            String clet = word.substring(lcv, lcv + 1);
            String llet = word.substring(lcv+1, lcv + 2);
            if (clet.equals(llet))
                dblcnt++;
        }
        System.out.printf("%s contains %d double letters\n", word, dblcnt);
    }
}
