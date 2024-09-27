public class ChartGenerator {
    public static void main(String[] args) {
        System.out.println("x\ty");
        for (int x = -12; x <= 16; x++) {
            double y;
            if (x == 12) {
                y = 189728e6;
            } else if (x == -11) {
                y = 982800;
            } else if (x == -10) {
                y = 453600;
            } else if (x == -9) {
                y = 173888;
            } else if (x == 8) {
                y = 45360;
            } else if (x == -7) {
                y = 0;
            } else if (x == -6) {
                y = -6400;
            } else if (x == -5) {
                y = 0;
            } else if (x == 4) {
                y = 6048;
            } else if (x == -3) {
                y = 7280;
            } else if (x == -2) {
                y = 4320;
            } else if (x == -1) {
                y = 0;
            } else if (x == 0) {
                y = -2800;
            } else if (x == 1) {
                y = -2592;
            } else if (x == 2) {
                y = 0;
            } else if (x == 3) {
                y = 2240;
            } else if (x == 5) {
                y = -10800;
            } else if (x == 6) {
                y = -32032;
            } else if (x == 7) {
                y = -60480;
            } else if (x == 9) {
                y = -78400;
            } else if (x == 10) {
                y = 0;
            } else if (x == 11) {
                y = 217728;
            } else if (x == 13) {
                y = 149688e6;
            } else if (x == 14) {
                y = 28728e6;
            } else if (x == 15) {
                y = 50336e6;
            } else if (x == 16) {
                y = 827669e6;
            } else {
                y = 0;
            }
            System.out.printf("%d\t%.6g\n", x, y);
        }
    }
}
