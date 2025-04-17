package langdocscpp;

import java.util.Scanner;

public class msoe20187 {
    public static int days(int month, int year) {
        int DIM = -1;
        if (month <= 7) {
            if (month == 2) DIM = (year % 4 == 0) ? 29 : 28;
            else DIM = (month % 2 == 1) ? 31 : 30;
        } else DIM = (month % 2 == 0) ? 31 : 30;
        return DIM;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter UNIX time: ");
        int unix = input.nextInt();
        int year = 1970;
        int day = 1;
        int month = 1; 
        int DIM = 31;
        int hrs = 0;
        int mins = 0;
        int secs = 0;
        while (unix >= 365 * 86400) {
            if (year % 4 == 0) unix -= 366 * 86400;
            else unix -= 365 * 86400;
            year++;
        }
        while (unix >= DIM * 86400) {
            unix -= DIM * 86400;
            if (month == 12) year++;
            month = month % 12 + 1;
            DIM = days(month, year);
        }
        while (unix >= 86400) {
            unix -= 86400;
            day++;
            if (day > DIM) {
                day = 1;
                if (month == 12) year++;
                month = month % 12 + 1;
                DIM = days(month, year);
            }
        }
        while (unix >= 3600) {
            unix -= 3600;
            hrs++;
            if (hrs >= 24) {
                hrs = 0;
                day++;
                if (day == DIM) {
                    day = 1;
                    if (month == 12) year++;
                    month = month % 12 + 1;
                    DIM = days(month, year);
                }
            }
        }
        while (unix >= 60) {
            unix -= 60;
            mins++;
            if (mins > 60) {
                mins = 0;
                hrs++;
                if (hrs > 24) {
                    if (day == DIM) {
                        day = 1;
                        if (month == 12) year++;
                        month = month % 12 + 1;
                        DIM = days(month, year);
                    }
                }
            }
        }
        while (unix >= 1) {
            unix -= 1;
            secs++;
            if (secs > 60) {
                secs = 0;
                mins++;
                if (mins > 60) {
                    mins = 0;
                    hrs++;
                    if (hrs > 24) {
                        if (day == DIM) {
                            day = 1;
                            if (month == 12) year++;
                            month = month % 12 + 1;
                            DIM = days(month, year);
                        }
                    }
                }
            }
        }
        String AMPM = (hrs >= 12) ? "PM" : "AM"; 
        hrs = (hrs == 0) ? 12 : (hrs > 12) ? hrs - 12 : hrs;
        if (mins == 0) System.out.printf("%d:%d0 %s\t\t%d/%d/%d", hrs, mins, AMPM, month, day, year);
        else System.out.printf("%d:%d %s\t\t%d/%d/%d", hrs, mins, AMPM, month, day, year);
    }
}

//1250100000 <-- my exact date and time of birth :D