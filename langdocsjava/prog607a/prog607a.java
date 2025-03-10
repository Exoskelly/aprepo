import java.sql.SQLOutput;
import java.util.Scanner;

public class prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            System.out.println("\tMenu\t\n0: Quit\n1: Encode Date\n2: Decode Date");
            System.out.print("Select an option: ");

            int option = input.nextInt();

            if (option == 1) {
                System.out.print("Enter Date (mdy): ");
                String date = input.next();
                Encode e = new Encode(date);
                e.calc();
                System.out.println(e.getpluh());
            } else if (option == 2) {
                System.out.print("Enter Code: ");
                String code = input.next();
                Decode d  = new Decode(code);
                d.calc();
                System.out.println(d.getdate());
            } else if (option == 0) {
                x = 0;
            } else {
                System.out.println("That is not an option. Please try again.");
            }
            System.out.println();
        }
    }
}