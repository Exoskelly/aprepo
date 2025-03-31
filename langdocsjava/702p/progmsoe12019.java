import java.util.*;

public class progmsoe12019 {
    public static int numlnLine(String key1, String key2, String line) {
        int cnt = 0;
        for (int lcv = 0; lcv < line.length() + 1; lcv++)
            if (line.substring(lcv, lcv + key1.length()).equals(key1) || line.substring(lcv, lcv + key1.length()).equals(key2)) 
                cnt++; 
            return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input two lets: ");
    }
}
