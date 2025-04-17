package langdocscpp;
 import java.util.*;

public class msoe20212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var pond = input.nextInt();
        input.nextLine();
        var line = input.nextLine();
        var cups = line.split(" ");
        int cnt = 0;
        for (int i = 0; i < cups.length; i++) {
            if (pond >= 10) {
                pond -= Integer.parseInt(cups[i]);
                pond--;
                cnt++;
            }
        }
        System.out.println("Filled " + cnt + " ");
    }
}