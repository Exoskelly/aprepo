public class prog122 {
    public static void main(String[] args) {
        System.out.printf("%-8s %-12s %-8s\n", "Number", "Cube Root", "Cube");
        for (int number = -25; number <= 25; number++) {
            double cubeRoot = Math.cbrt(number); 
            int cube = number * number * number; 
            System.out.printf("%-8d %-12.5f %-8d\n", number, cubeRoot, cube);
        }
    }
}
