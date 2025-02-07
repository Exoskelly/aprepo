package abclab;

import java.util.Scanner;

public class abclab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("C radius: ");
        double r = kbd.nextDouble();
        Shape s1 = new Circle(r);

        System.out.print("R height: ");
        double rh = kbd.nextDouble();
        System.out.print("R width: ");
        double rw = kbd.nextDouble();
        Shape s2 = new Rectangle(rh, rw);

        System.out.print("T height: ");
        double th = kbd.nextDouble();
        System.out.print("T Base: ");
        double tb = kbd.nextDouble();
        Shape s3 = new Triangle(th, tb);

        ((Circle) s1).printClass();
        s1.calcArea();
        ((Circle) s1).calcCircum();                
        
        ((Rectangle) s2).printClass();
        s2.calcArea();
        s3.calcPerim();
        
        ((Triangle) s3).printClass();
        s3.calcArea();
        s3.calcPerim();
    }
}
