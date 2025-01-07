// Print out all the cats (there is no toString() available)
// Print the name of the 3rd cat.
// The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
// The cat named Rascal died. Find that cat and remove it from the list. 
// A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
// A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list. 
// Print the updated list with a for-each loop
// Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list. 
// Switch the 2nd and 4th cats.
// Print the names of the cats on the list.
// Remove all cats under $26. Print the costs of each cat remaining on the list.
// All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.
//               Print the names of the cats being put on a diet.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BigArrayListCat {
    public static void printCat(Cat cat) {
        System.out.printf("%s\t%.2f%d\t$%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/bogarraylist.dat"));
            int numcats = file.nextInt();
            file.nextLine();
            ArrayList<Cat> cats = new ArrayList<>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String n = file.nextLine();
                double w = file.nextDouble();
                int a = file.nextInt();
                double c = file.nextDouble();
                file.nextLine();
                cats.add(new Cat(n, w, a, c));
            }
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats)
                printCat(cat);
            
            System.out.println("\n2. The third cat is named: " + cats.get(2).getName());

            cats.get(cats.size() - 1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
            System.out.println();

            Cat third = cats.get(2);
            cats.set(2, new Cat("Sugar, 23.6, 7, 33.25"));
            Cat temp = cat.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            for (int i = 0; i < cats.size(); i++) {
                if (cats.get(i).getCost() < 26) {
                    cats.remove(i);
                    i--; 
                }
            }
        }
    }
}