package prog701g;

public class Admin extends Person {
    private String myFavw;

    public Admin(String fn, String ln, String fav) {
        super(fn, ln);
        myFavw = fav;
    }

    public String getFavw() { return myFavw;}
}
