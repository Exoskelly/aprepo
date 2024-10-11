import java.util.*;
public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String result = reverseWords(sentence);
        System.out.println(result); 
    }
}