import java.io.File                                                                                                                           ;
import java.io.IOException                                                                                                                    ;
import java.util.*                                                                                                                            ;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505a.dat"))                                                             ;
            List<clprog505areadernotreaderbookperson> list = new ArrayList<clprog505areadernotreaderbookperson>()                             ;

            while (file.hasNext()) {
               String fname  = file.next()                                                                                                    ;
                String lname = file.next()                                                                                                    ;
         int    books        = file.nextInt()                                                                                                 ;
              String name    = fname + " " + lname                                                                                            ;
                clprog505areadernotreaderbookperson clprog505areadernotreaderbookperson = new clprog505areadernotreaderbookperson(name, books); 
                list.add(clprog505areadernotreaderbookperson)                                                                                 ;
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                clprog505areadernotreaderbookperson cur = list.get(lcv)                                                                       ;
                cur.calc()                                                                                                                    ;
            }

            System.out.println("Reading Contest:\nName\tBooks\tPoints")                                                                     ;
            for (clprog505areadernotreaderbookperson  p : list)
                System.out.println(p)                                                                                                         ;

            double tot = 0                                                                                                                    ;
            for (clprog505areadernotreaderbookperson p : list) tot += p.getPoints()                                                           ;
            double avg = tot / list.size()                                                                                                    ;
            System.out.println("\nAverage points: " + avg)                                                                                    ;                                                           

            int    bestPoints  = list.get(0).getPoints()                                                                                ;
            String bestName    = list.get(0).getName()                                                                                  ;
            for (int lcv = 1; lcv < list.size(); lcv++) {                                                            
                clprog505areadernotreaderbookperson Keith = list.get(lcv)                                                                     ;
                if (Keith.getPoints()> bestPoints) {                                                            
                    bestPoints = Keith.getPoints()                                                                                            ;
                    bestName = Keith.getName()                                                                                                ;
            }                                                            
        }                                                            
            System.out.println("The winner is: " + bestName)                                                                                  ;
                                                                 
        } catch (IOException e) {                                                            
            System.out.println("Error: " + e)                                                                                                 ;
        }
    }
}