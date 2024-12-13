import java.util.Scanner;

public class lp314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter votes for Awbrey in New York: ");
        int awbreyNY = scanner.nextInt();

        System.out.print("Enter votes for Martinez in New York: ");
        int martinezNY = scanner.nextInt();

        System.out.print("Enter votes for Awbrey in New Jersey: ");
        int awbreyNJ = scanner.nextInt();

        System.out.print("Enter votes for Martinez in New Jersey: ");
        int martinezNJ = scanner.nextInt();

        System.out.print("Enter votes for Awbrey in Connecticut: ");
        int awbreyCT = scanner.nextInt();

        System.out.print("Enter votes for Martinez in Connecticut: ");
        int martinezCT = scanner.nextInt();

        int totalAwbrey = awbreyNY + awbreyNJ + awbreyCT;
        int totalMartinez = martinezNY + martinezNJ + martinezCT;
        int totalVotes = totalAwbrey + totalMartinez;

        double awbreyPercentage = (totalAwbrey * 100.0) / totalVotes;
        double martinezPercentage = (totalMartinez * 100.0) / totalVotes;

        System.out.println("\nElection Results for New York:");
        System.out.println("Awbrey: " + awbreyNY);
        System.out.println("Martinez: " + martinezNY);

        System.out.println("\nElection Results for New Jersey:");
        System.out.println("Awbrey: " + awbreyNJ);
        System.out.println("Martinez: " + martinezNJ);

        System.out.println("\nElection Results for Connecticut:");
        System.out.println("Awbrey: " + awbreyCT);
        System.out.println("Martinez: " + martinezCT);

        System.out.println("\nCandidate\tVotes\tPercentage");
        System.out.printf("Awbrey\t\t%d\t%.2f%%\n", totalAwbrey, awbreyPercentage);
        System.out.printf("Martinez\t\t%d\t%.2f%%\n", totalMartinez, martinezPercentage);
        System.out.println("TOTAL VOTES: " + totalVotes);
    }
}
