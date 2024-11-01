import java.util.Random;
import java.util.Scanner;

public class lp46 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        char[] operators = {'+', '-', '*', '/'};
        char operator = operators[random.nextInt(4)];

        int correctAnswer = 0;

        switch (operator) {
            case '+':
                correctAnswer = num1 + num2;
                break;
            case '-':
                correctAnswer = num1 - num2;
                break;
            case '*':
                correctAnswer = num1 * num2;
                break;
            case '/':
                correctAnswer = num1 / num2;
                break;
        }

        System.out.printf("What is %d %c %d? ", num1, operator, num2);
        int userAnswer = scanner.nextInt();

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Incorrect. The correct answer is %d.%n", correctAnswer);
        }
    }
}
