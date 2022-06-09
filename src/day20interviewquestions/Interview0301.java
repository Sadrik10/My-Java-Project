package day20interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Interview0301 {

    public static void main(String[] args) {

        /*    Create a function that takes an array and
           returns the difference between the biggest and the smallest numbers.
              Ask user to enter array elements.   */

        // User story / taste case

        int [] arr = getArray();

        System.out.println("The difference between biggest and smallest is " + getDifference(arr));

    }
    public static int[] getArray (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i+1) + ". array value");
            arr [i]= scan.nextInt();
        }
        System.out.println("this is the array " + Arrays.toString(arr));
        return arr;
    }
    public static int getDifference (int [] arr) {
        Arrays.sort(arr); // I have passed the array and sorted now.
        return arr[arr.length -1] - arr[0];

    }
}
