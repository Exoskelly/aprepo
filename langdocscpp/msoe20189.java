package langdocscpp;
import java.util.Scanner;

public class msoe20189 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter plain cipher or text: ");
        String line = input.nextLine().toUpperCase();
        System.out.print("Enter key: ");
        int key = input.nextInt();
        String strBinary = "";
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int numeric = ((int) c) - 32;
            String binary = Integer.toBinaryString(numeric);
            while (binary.length() != 6) binary = "0" + binary;
            strBinary += binary;
        }
        String strKey = "000000" + Integer.toBinaryString(key);
        String newStrBinary = "";
        int cnt = 0;
        for (int i = 0; i < strBinary.length(); i++) {
            if (cnt == strKey.length()) cnt = 1;
            newStrBinary += strBinary.charAt(i) ^ strKey.charAt(cnt);
            cnt++;
        }
        String newLine = "";
        for (int i = 0; i < newStrBinary.length(); i+=6) {
            int ascii = Integer.parseInt(newStrBinary.substring(i, i+6), 2) + 32;
            char c = (char) ascii;
            newLine += c;
        }
        System.out.print(newLine);
    }
}

