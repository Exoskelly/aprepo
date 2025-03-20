public class prog152a {
    public static int pluh(int num) {
        int sum = num;
        if (num >= 9669) return sum;
        return sum += pluh(num + 3);
    }
    public static void main(String[] args) {
        System.out.println("The sum of the numbers is: " + pluh(3));
    }
}