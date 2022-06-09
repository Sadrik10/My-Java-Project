package day20interviewquestions;

import java.util.Scanner;

public class Interview02 {

    // Write a Java Program to swap two numbers

    // 12
    // 10

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");

        double n1 = scan.nextDouble(); // 10
        double n2 = scan.nextDouble(); // 20


        System.out.println("Before swapping numbers: " + n1 +" " + n2);
//        //      10    10
//        double temp = n1;
//        //20  20
//        n1 = n2;
//        //10  10
//        n2 = temp;
//
//        System.out.println("After swapping numbers: " + n1 +" " + n2);


        //2. way of swapping
        //30    10   20
        n1  = n1 + n2 ;
        // 10      30  20
        n2 = n1 - n2;
        // 20     30  10
        n1 = n1 - n2;

        System.out.println("After swapping numbers: " + n1 +" " + n2);
    }
}