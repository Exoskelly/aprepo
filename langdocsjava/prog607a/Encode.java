public class Encode {
    private String atl;
    private String qtz;
    private String batz;
    private String myDate;
    private String pluh;

    public Encode(String date) {
        atl = " ABCDEFGHIJKL";
        qtz = " QRSTUVWXYZ";
        batz = " ZYXWVUTSRQPONMLKJIHGFEDCBA";
        myDate = date;
        pluh = "";
    }

    public void calc() {
        if (myDate.substring(0, 1).equals("0")) {
            pluh += atl.substring(Integer.parseInt(myDate.substring(1, 2)), Integer.parseInt(myDate.substring(1, 2)) + 1);
        } else {
            pluh += atl.substring(Integer.parseInt(myDate.substring(0, 2)), Integer.parseInt(myDate.substring(0, 2)) + 1);
        }

        if (myDate.substring(2, 3).equals("0")) {
            pluh += "O" + qtz.substring(Integer.parseInt(myDate.substring(3, 4), Integer.parseInt(myDate.substring(3, 4) + 1)));
        } else {
            pluh += qtz.substring(Integer.parseInt(myDate.substring(2, 3)), Integer.parseInt(myDate.substring(2, 3)) + 1) + qtz.substring(Integer.parseInt(myDate.substring(3, 4)), Integer.parseInt(myDate.substring(3, 4)) + 1);
        }

        pluh += batz.substring((Integer.parseInt(myDate.substring(4, 6)) - 70), Integer.parseInt(myDate.substring(4, 6)) - 70 + 1);
    }

    public String getpluh() { return pluh; }
}