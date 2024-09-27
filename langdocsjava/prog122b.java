public class HourlyPayChart {
    public static void main(String[] args) {
        System.out.println("Hours Worked   Amount Earned");
        System.out.println("---------------------------");

        for (int hours = 1; hours <= 40; hours++) {
            double earnings = hours * 4.00;  // 4 dollars per hour
            System.out.printf("%-14d $%.2f\n", hours, earnings);
        }
    }
}