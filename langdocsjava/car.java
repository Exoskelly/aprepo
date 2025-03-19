public class car extends vehicle {
    private int myWorth;

    public car(String name, int tire, int worth) {
        super(name, tire); 
        myWorth = worth;
    }

    public int getWorth() { return myWorth; }
}