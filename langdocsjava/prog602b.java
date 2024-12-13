import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class prog602b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdot/prog602b.dat"));
            ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();

            while (file.hasNext())
                int id = file.nextInt();
                
        }
    }
}