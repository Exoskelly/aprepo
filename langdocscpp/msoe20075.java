package langdocscpp;

import java.util.*;

public class msoe20075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toUpperCase();

        int maxLen = 0;
        int currLen = 1;
        List<Character> maxChars = new ArrayList<>();

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    maxChars.clear();
                    maxChars.add(input.charAt(i - 1));
                } else if (currLen == maxLen) {
                    if (!maxChars.contains(input.charAt(i - 1))) {
                        maxChars.add(input.charAt(i - 1));
                    }
                }
                currLen = 1;
            }
        }
        if (currLen > maxLen) {
            maxLen = currLen;
            maxChars.clear();
            maxChars.add(input.charAt(input.length() - 1));
        } else if (currLen == maxLen) {
            if (!maxChars.contains(input.charAt(input.length() - 1))) {
                maxChars.add(input.charAt(input.length() - 1));
            }
        }

        System.out.print(maxLen + " ");
        for (char ch : maxChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
