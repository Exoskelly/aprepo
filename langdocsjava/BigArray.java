public class BigArray {
    int[] array = new int[19];
    for (int lcv = 0; lcv < array.length; lcv++) {
        array[lcv] = (int)(Math.random()* (91-20) + 20);
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i] + " ");
    }
    System.out.println();
    for (int temp : array) 
        System.out.println(temp + " ");
    System.out.println();
    System.out.println("The middle number is: " + array[array.length / 2]);
    double avg = array[0] + array[array.length -1] + array[array.length / 2];
    System.out.println("Average of first, middle, and last numbers is: " + (avg/3));
    int smallest = array[0];
    int largest = array[0];
    for (int i : array) {
        if (i < smallest) smallest = i;
        if (i > largest) largest = i;
    }
    System.out.println("Smallest Number: " + smallest);
    System.out.println("Largest Number: " + largest);
    }
    int smallindex, largeindex = -1;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == smallindex) smallindex = i;
        if (array[i] == largeindex) largeindex = i;
    }
    int tempswap = array[smallindex];
    array[smallindex] = array[largeindex];
    array[largeindex] = tempswap;

    for (int x : array)
        System.out.print(x + " ");
    System.out.println();
    int randnum = (int) (Math.random() * 10 + 1);
    array[array.length / 2] = randnum;
    for (int x : array)
         System.out.print(x + " ");
    System.out.println();
    for (int num : array)
        if (num >= 50 && num <= 59)
            System.out.print(num + " ");
        System.out.println();
    for (int i = 0; i  <array.length; i++)
        if (array[i] % 4 == 0)
            System.out.print(array[i] + " ");
    System.out.println();
    boolean sixty = false;
    for (int n : array)
        if (n == 60) sixty = true;
    System.out.println("Is 60 in the list: " + sixty);
    boolean same = true;
    for (int lcv = 0; lcv < array.length; lcv++)
        if (array[lcv] != array[array.length-1-lcv])
            same = false;
    System.out.println("Is the array palindromic: " + same);
    double average = 0;
    for (int c : array) average += x;
    average /= array.length;
    int avgCount = 0;
    for (int x : array)
        if (x > average) avgCount++;
    System.out.printf("There are %d numbers are greater than the average\n", avgCount);
    int evens = 0;
    for (int num : array)
        if (num % 2 == 0) evens ++;
    System.out.printf("There are %d even numbers\n", evens);
    int[] array2 = new int[array.length];
    for (iny i = 0; i < array.length; i++)
        array2[i] = array[(array.length-1)-i];
    for (int n : array)
        System.out.print(n + " ");
    System.out.println();
    int sum = 0;
    for (int sum : array) {
        int digitsum = 0;
        int temp = num;
        while (temp > 0) {
            int n = temp % 10;
            temp /= 10;
            digitsum += n;
        }
        sum += digitsum;
    }
    System.out.println("Sum of all digits of all elements: " + sum);;  
public static int [] circularShiftRight(int[] arr) {
    int temp = arr[arr.length - 1];
    int [] shifted = new int [arr.length];
    for (int lcv = 1; lcv < arr.length; lcv++)
        shifted[lcv] = arr[lcv-1];
    shifted[0] = temp;
    return shifted;
}
}
}
