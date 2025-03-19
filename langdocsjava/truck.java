public class truck extends vehicle {
    private int myMileage;

    public truck(String name, int tire, int mileage) {
        super(name, tire);
        myMileage = mileage;
    }

    public int getMileage() { return myMileage; }
}