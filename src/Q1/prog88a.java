package Q1;

public class prog88a {
    public static void main(String[] args){
        int num1 = (int) (Math.random() * (13-1)) + 1;
        int num2 = (int) (Math.random() * (20-1)) + 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int pro = num1 * num2;
        double div = num1 / num2;

        int abs = Math.abs(dif);
        int max, min;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        } if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + dif);
        System.out.println("Product is " + pro);
        System.out.println("Div is " + div);
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);

    }
}
