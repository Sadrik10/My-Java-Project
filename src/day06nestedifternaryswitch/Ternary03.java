package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {

  /*
    You have 2 integers;
    If both of the integers are positive do multiplication
    If one is negative the other one is positive return "I do not how to multiply"
 */
    // Note: If your ternary returns different data types for different scenarios, do not create reserved area for the result,
    // put it directly inside System.out.println()

  public static void main(String[] args) {

      int a1 = 5;
      int a2 = -3;

      String result=  (a1>0 && a2>0) ? "Multiplication is " +a1*a2 : "I do not know how to multiply";
      System.out.println(result);

      // Other way.

      Scanner myObj = new Scanner(System.in);
      System.out.println("Please enter two numbers");
      int num1 = myObj.nextInt();
      int num2 = myObj.nextInt();
      int jkl = num1*num2;
      String resolve = num1>0 && num2>0 ? String.valueOf(jkl) : "I do not how to multiply";
      System.out.println(resolve);


  }

}
