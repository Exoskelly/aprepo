public class SquareVsSquared {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-15s%n", "Number", "Square", "Square Root");

        for (int num = 1; num <= 50; num++) {
            int square = num * num;                  
            double squareRoot = Math.sqrt(num);       

            System.out.printf("%-10d %-10d %-15.2f%n", num, square, squareRoot);
        }
    }
}
