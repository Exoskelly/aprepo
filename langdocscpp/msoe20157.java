package langdocscpp;

import java.util.Scanner;

public class msoe20157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be partitioned: ");
        int num = scanner.nextInt();
        System.out.print("The array is: ");
        int[] arr = new int[3];
        for (int i = 0; i <= num; i++) {
            int t1 = (i*(i+1))/2;
            for (int j = 0; j <= num; j++) {
                int t2 = (j*(j+1))/2;
                for (int k = 0; k <= num; k++) {
                    int t3 = (k*(k+1))/2;
                    if (t1 + t2 + t3 == num) 
                        arr = new int[]{t1, t2, t3};
                }
            }
        }
        for (int krillion : arr)
            System.out.print(krillion + " ");
    }
}