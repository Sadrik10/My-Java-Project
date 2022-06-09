package day20interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Interview03 {
     /*
      Create a function(method) that takes an array and
      returns the difference between the biggest and the smallest numbers.
       Ask user to enter array elements.
       {12, 23, 11, 44, 5} 44 - 5 = 39
   */
    //user story / test case

    public static void main(String[] args) {

        Scanner scan =new  Scanner(System.in);

        System.out.println("Enter the length of the array");

        int len = scan.nextInt();
        // 5
        int [] arr = new int[len];

        System.out.println("Please type the array elements");
        for(int i = 0; i< len; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The difference between the biggest value and smallest value of the array is: "+getDifference(arr));
    }
    public static int getDifference(int [] arr){

        Arrays.sort(arr);//Now I have array elements in sorted order
        //41
        return arr[arr.length - 1] - arr[0];
    }
}
