package day06nestedifternaryswitch;

public class Ternary02 {

    //Type code to calculate the absolute value of a number
    public static void main(String[] args) {


        int a = -5;
        int result = (a < 0) ? a * -1 : a;
        System.out.println(result);

        //For positive numbers nad zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        double num = 0;
        double absoluteValue = num>0 ?  num : -1*num;
        System.out.println(absoluteValue);

    }
}