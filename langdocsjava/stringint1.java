import java.util.*;

public class strint1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.im);
        System.out.println("Enter the string: ");
        String str = input.nextline();
        System.out.print("Duplicate characters: ");

        for (int lcv = 0; lcv < str.length(); lcv++) {
            for (int lcv2 = lcv+1; lcv < str.length(); lcv2++) {
                String let1 = str.substring(lcv, lcv+1);
                String let2 = str.substring(lcv2, lcv2+1);

                if (let1.equals(let2)) {
                    System.out.print(let2 + " ");
                    break;
                }
            }
        }
    }
}