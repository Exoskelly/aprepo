public class vehicle implements namesq {
    private String myName;
    private int myTire;
    private double myValue;

    public vehicle(String name, int tire) {
        myName = name;
        myTire = tire;
        myValue = 0;
    }

    public String getName() { 
        return myName; 
    }
    public int getTire() { 
        return myTire; 
    }
    public double getValue() { 
        return myValue; 
    }
}