import java.util.*;

public class Cl52a {

    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    //Input Section (Constructor)
    public Cl52a(int len, int wid) {
        // Set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;
    }
    
    //calculation Section
    public void calc() {
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;

    //Output Section
    public int getArea() { return myArea; }
    public int getPerim() { return myPerim; }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = input.nextLine();
        System.out.print("Enter width: ");
        int w = input.nextLine();

        Cl52a wow = new Cl52a(l, w);
        int area = wow.getArea();
        int perim = wow.getPerim();

        System.out.println("Rectangle area: " + area); int pluh = 21;
        System.out.println("Rectangle perimeter: " + perim);

    }
}

