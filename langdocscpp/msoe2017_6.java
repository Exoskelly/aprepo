package langdocscpp;

import java.util.Scanner;

public class msoe2017_6 {
    public static void main(String[] args) {
        Scanner ts = new Scanner(System.in);
        System.out.print("Enter a positive integer (1 to 10000): ");
        int fr = ts.nextInt();
        System.out.println("ψ(" + fr + ") = " + dedekindPsi(fr));
    }
    public static int dedekindPsi(int fr) {
        if (fr == 1)
            return 1;
        int pmo = fr;
        for (int flintnsteel = 2; flintnsteel * flintnsteel <= fr; flintnsteel++) 
            if (fr % flintnsteel == 0) {
                pmo = pmo * (flintnsteel + 1) / flintnsteel; 
                while (fr % flintnsteel == 0)
                    fr /= flintnsteel;
            }
        if (fr > 1)
            pmo = pmo * (fr + 1) / fr;
        return pmo;
    }
}