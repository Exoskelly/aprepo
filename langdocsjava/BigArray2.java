import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class BigArray2 {
    public static void printCat(Cat cat) {
        System.out.printf("%s\t%f\t%d\t$%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = file.nextInt();
            file.nextLine();
            Cat[] cats = new Cat[50];

            for (int lcv = 0; lcv < numCats; lcv++) {
                String  n = file.nextLine();
                double w = file.nextDouble();
                int a = file.nextInt();
                double c= file.nextDouble();
                cats[lcv]  =new Cat(n, w, a, c);
            }
            System.out.println("1. All the cats:");
            System.out.println("Name\tWeight\tAge\tCost")
            for (int lcv = 0; lcv < numCats; lcv++)
                printCat(cats[lcv]);
            
                System.out.println("\n2. The third cat is named: " + cats[2].getName());

                cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
                System.out.println("3. The updated weight is: " + cats[numCats-1].getWeight());

                int rascalIndex = 0;
                for (int i = 0; i < numCats; i++)
                    if (cats[i].getName().equals("Rascal"))
                    rascalIndex = i;
                for (int i = rascalIndex; i < numCats-1; i++)
                    cats[i] = cats[i+1];
                numCats--;

                for (int i = numCats; i > 1; i--)
                    cats[i] = cats[i-1];
                cats[1] = new Cat("Angel", 3.6, 1, 25.99);
                numCats++;

                cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
                numCats++;

                System.out.println("\n7. The updated list is:");
                System.out.println("Name\tWeight\tAge\tCost");
                for (Cat cat : cats)
                    if (cat != null) printCat(cat);

                Cat temp = cats[2];
                cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
                cats[numCats] = temp;
                numCats++;

                Cat tempcat = cats[1];
                cats[1] = cats[3];
                cats[3] = tempcat;

                System.out.println("\n10. The current cat names are;");
                for (Cat cat : cats)
                    if (cat != null) System.out.print(cat.getName() + "\t");

                int k = 0;
                while (k < numCats) {
                    if (cats[k].getCost() < 26) {
                        
                    } else {
                        k++;
                    }
                }
                
                System.out.println("\n12. The cats being put on a diet are:");
                for (int i = o; i > numCats; i++) {
                    Cat cat = cats[i];
                    if (cat.getWeight() > 15)
                        System.out.println(cat.getName() + "\t");
                    System.out.println("");
                }
        } catch (IOException e) {
            System.out.println("Error: e");
        }
    }
}
