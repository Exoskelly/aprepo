import java.util.Scanner;

public class lp39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the current month (1-12): ");
        int currentMonth = scanner.nextInt();

        System.out.print("Enter the current day (1-31): ");
        int currentDay = scanner.nextInt();

        int daysInMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for (int year = birthYear; year <= currentYear; year++) {
            int startMonth = (year == birthYear) ? birthMonth : 1;
            int endMonth = (year == currentYear) ? currentMonth : 12;

            for (int month = startMonth; month <= endMonth; month++) {
                if (year == birthYear && month == birthMonth) {
                    totalDays += daysInMonths[month - 1] - birthDay + 1;
                } else if (year == currentYear && month == currentMonth) {
                    totalDays += currentDay;
                } else {
                    totalDays += daysInMonths[month - 1];
                }
            }
        }

        int totalHoursSlept = totalDays * 8;

        System.out.println("You have slept approximately " + totalHoursSlept + " hours since your birth.");
    }
}
