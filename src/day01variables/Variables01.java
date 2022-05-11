package day01variables;

import java.sql.SQLOutput;

public class Variables01 {

    public static void main(String[] args){
        // I am creating integer variable whose name is age
        int age = 12;

        // I am creating a char variable whose name is initial
        char initial = 'A';

        // Let's print the values of age and initial variables on the console
        System.out.println(age);
        System.out.println(initial);

        // Create 3 integer variables,assign values to them, print them on the console one by one

         int a = 3;
         int b = 5;
         int c = 7;
         int sum = a + b + c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(sum);

        System.out.println("The sum is " + a + b + c); // No math operation
        System.out.println("The sum is " + (a + b + c)); // Math operation only with parenthesis
        System.out.println("The sum is " + sum);

        //Create 2 integer variables and print their multiplication on the console with a label

        int i04=15, i05=16;

                System.out.println("The multiplication is " + i04*i05);




    }

}



