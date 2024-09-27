public class ChartGenerator {
    public static void main(String[] args) {
        for (int x = 2; x <= 10; x += 2) {
            int col2 = x + 1;            // Column 2: x + 1
            int col3 = x * 2;            // Column 3: x * 2
            int col4 = x * x;            // Column 4: x * x (square of x)
            System.out.printf("%d\t%d\t%d\t%d\n", x, col2, col3, col4);
        }
    }
}
