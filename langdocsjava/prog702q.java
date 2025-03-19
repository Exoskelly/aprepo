import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.txt"));

            List<vehicle> list = new ArrayList<>();

            int num = input.nextInt();

            while (input.hasNext()) {
                if (num == 1) {
                    String name = input.next();
                    int tire = input.nextInt();
                    int worth = input.nextInt();
                    vehicle v = new car(name, tire, worth);
                    list.add(v);
                } else if (num == 2) {
                    String name = input.next();
                    int tire = input.nextInt();
                    int mileage = input.nextInt();
                    vehicle v = new truck(name, tire, mileage);
                    list.add(v);
                } else if (num == 3) {
                    String name = input.next();
                    int tire = input.nextInt();
                    String homeTown = input.next();
                    vehicle v = new bus(name, tire, homeTown);
                    list.add(v);
                }
                if (input.hasNext()) num = input.nextInt();
            }

            int totCWorth = 0;
            int cCnt = 0;

            double totworth = 0;
            String tNameLstVal = "";
            double tLstVal = 99999999;

            String longestHTName = "";
            int longestHTNameCnt = 0;
            int totBworth = 0;

            int totCtires = 0;
            int totTtires = 0;
            int totBtires = 0;

            double totWorth = 0;

            for (vehicle v : list) {
                if (v instanceof car) {
                    totCWorth += ((car)v).getWorth();
                    cCnt++;
                    totCtires += ((car)v).getTire();
                } else if (v instanceof truck) {
                    double tWorth = 50000 - (((truck)v).getMileage() * 0.25);
                    totCWorth += tWorth;
                    totTtires += ((truck)v).getTire();
                    if (tWorth < tlstVal) {
                        tlstVal = tWorth;
                        tNamelstVal = ((truck)v).getName();
                    }
                } else if (v instanceof bus) {
                    totBtires += ((bus)v).getTire();
                    if (((bus)v).getHomeTown().length() > longestHTNameCnt) {
                        longestHTName = ((bus)v).getHomeTown();
                        longestHTNameCnt = longestHTName.length();
                    }
                    totBworth += 50000;
                }
            }

            totWorth = totCWorth + totTtires + totBworth;

            System.out.println("Total number of vehicles: " + list.size());
            System.out.println("Total amount of the cars' worth: $" + totCWorth);
            System.out.println("Total amount of the vehicles' worth: $" + totWorth);
            System.out.println("Longest home destination name: " + longestHTName);
            System.out.println("truck with The least value: " + tNamelstVal + " ($" + tlstVal + ")");
            System.out.println("Total number of car tires: " + totCtires);
            System.out.println("Total number of truck tires: " + totTtires);
            System.out.println("Total number of bus tires: " + totBtires);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}