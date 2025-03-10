public class Decode {
    private String atl;
    private String qtz;
    private String batz;
    private String myDate;
    private String pluh;
    
    public Decode(String date) {
        atl = "ABCDEFGHIJKL";
        qtz = "QRSTUVWXYZ";
        batz = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        myDate = date;
        pluh = "";
    }

    public void calc() {
        pluh += qtz.indexOf(pluh.substring(0, 1)) + "/";

        if (!pluh.substring(1, 2).equals("O")) {
            myDate += atl.indexOf(pluh.substring(1, 2));
            myDate += atl.indexOf(pluh.substring(2, 3)) + "/";
        } else {
            myDate += atl.indexOf(pluh.substring(2, 3)) + "/";
        }

        myDate += Integer.parseInt(String.valueOf(batz.indexOf(pluh.substring(3,4)) + 70));
    }

    public String getdate() {
        return pluh;
    }
}