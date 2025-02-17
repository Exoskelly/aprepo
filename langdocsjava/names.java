import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface names {
    String getName();
    int getTire();
    double getValue();
}

abstract class Vehicle implements names {
    protected String name;
    protected int tireCount;

    public Vehicle(String name, int tireCount) {
        this.name = name;
        this.tireCount = tireCount;
    }

    public String getName() {
        return name;
    }

    public int getTire() {
        return tireCount;
    }

    public abstract double getValue();
}

class Car extends Vehicle {
    private double worth;

    public Car(String name, int tireCount, double worth) {
        super(name, tireCount);
        this.worth = worth;
    }

    @Override
    public double getValue() {
        return worth;
    }
}

class Truck extends Vehicle {
    private double mileage;

    public Truck(String name, int tireCount, double mileage) {
        super(name, tireCount);
        this.mileage = mileage;
    }

    @Override
    public double getValue() {
        return 50000 - (0.25 * mileage);
    }
}

class Bus extends Vehicle {
    private String homeCity;

    public Bus(String name, int tireCount, String homeCity) {
        super(name, tireCount);
        this.homeCity = homeCity;
    }

    @Override
    public double getValue() {
        return 50000;
    }

    public String getHomeCity() {
        return homeCity;
    }
}

public class VehicleTracker {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        int totalVehicles = 0;
        double totalCarsWorth = 0;
        double totalWorth = 0;
        int totalCarTires = 0, totalTruckTires = 0, totalBusTires = 0;
        String longestBusHomeCity = "";
        double minTruckValue = Double.MAX_VALUE;
        Truck minTruck = null;

        try (BufferedReader br = new BufferedReader(new FileReader("prog702q.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                int vehicleType = Integer.parseInt(data[0]);

                switch (vehicleType) {
                    case 1: 
                        String carName = data[1];
                        int carTires = Integer.parseInt(data[2]);
                        double carWorth = Double.parseDouble(data[3]);
                        Car car = new Car(carName, carTires, carWorth);
                        vehicles.add(car);
                        totalVehicles++;
                        totalCarsWorth += car.getValue();
                        totalWorth += car.getValue();
                        totalCarTires += carTires;
                        break;

                    case 2: 
                        String truckName = data[1];
                        int truckTires = Integer.parseInt(data[2]);
                        double truckMileage = Double.parseDouble(data[3]);
                        Truck truck = new Truck(truckName, truckTires, truckMileage);
                        vehicles.add(truck);
                        totalVehicles++;
                        double truckValue = truck.getValue();
                        totalWorth += truckValue;
                        totalTruckTires += truckTires;
                        if (truckValue < minTruckValue) {
                            minTruckValue = truckValue;
                            minTruck = truck;
                        }

                    case 3: 
                        String busName = data[1];
                        int busTires = Integer.parseInt(data[2]);
                        String busHomeCity = data[3];
                        Bus bus = new Bus(busName, busTires, busHomeCity);
                        vehicles.add(bus);
                        totalVehicles++;
                        totalWorth += bus.getValue();
                        totalBusTires += busTires;
                        if (busHomeCity.length() > longestBusHomeCity.length()) {
                            longestBusHomeCity = busHomeCity;
                        }
                        break;
                }
            }

            System.out.println("Total number of vehicles: " + totalVehicles);
            System.out.println("Total worth of cars: $" + totalCarsWorth);
            System.out.println("Total worth of all vehicles: $" + totalWorth);
            System.out.println("Longest bus home destination: " + longestBusHomeCity);
            if (minTruck != null) {
                System.out.println("Truck with the least value: " + minTruck.getName());
            }
            System.out.println("Total tires in cars: " + totalCarTires);
            System.out.println("Total tires in trucks: " + totalTruckTires);
            System.out.println("Total tires in buses: " + totalBusTires);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
