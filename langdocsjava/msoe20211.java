import java.util.Scanner;

public class msoe20211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        boolean found = false;

        for (String word : words) {
            if (word.endsWith(letter)) {
                System.out.println(word);
                found = true;
                return;
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }
}