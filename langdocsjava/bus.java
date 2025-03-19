public class bus extends vehicle {
    private String myHomeTown;

    public bus(String name, int tire, String homeTown) {
        super(name, tire);
        myHomeTown = homeTown;
    }

    public String getHomeTown() { return myHomeTown; }
}