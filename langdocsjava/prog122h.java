public class prog122h
 {
    public static void main(String[] args) {
        System.out.printf("%-8s %-8s %-15s %-8s %-15s\n", "Number", "Square", "Square Root", "Cube", "4th Root");
        for (int number = 1; number <= 20; number++) {
            int square = number * number;
            double squareRoot = Math.sqrt(number);
            int cube = number * number * number;
            double fourthRoot = Math.pow(number, 0.25);
            System.out.printf("%-8d %-8d %-15.4f %-8d %-15.4f\n", number, square, squareRoot, cube, fourthRoot);
        }
    }
}
