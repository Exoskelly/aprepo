import java.util.*;

public class msoe12019 {
    public static int numInLine(String key1, String key2, String line) {
        int cnt = 0;
        for (int lcv = 0; lcv <= line.length() - key1.length(); lcv++) {
            String sub = line.substring(lcv, lcv + key1.length());
            if (sub.equals(key1) || sub.equals(key2)) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input two lets: ");
        String key1 = scanner.next();
        String key2 = scanner.next();
        scanner.nextLine();
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();
        int result = numInLine(key1, key2, line);
        System.out.println("Count: " + result);
    }
}
