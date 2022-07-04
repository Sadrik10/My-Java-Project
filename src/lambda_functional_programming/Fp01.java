package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    public static void main(String[] args) {
         /*
          Lambda is a functional programming, we have had Lambda in Java with version 8
          Functional programming focuses on "What to do", with structured programming we focus on "How to do"
          Functional programming is used just with Collections and Arrays
          We cannot use Maps directly in functional programming, but we can convert Maps to Sets and use them
          we can use entrySet()
         */
        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        printElementsStructured(l);
        System.out.println("\n=========================");

        printElementsFunctional(l);
        System.out.println("\n=========================");

        printEvenElementsStructured(l);
        System.out.println("\n=========================");

        printEvenElementsFunctional(l);
        System.out.println("\n=========================");

        printSquareOfOddElements(l);
        System.out.println("\n=========================");

        printCubeOfDistinctElements(l);
        System.out.println("\n=========================");

        getMaxElement01(l);
        System.out.println("===============");

        getMaxElement02(l);
        System.out.println("===============");

        getMinGreaterThanSeven01(l);
        System.out.println("===============");

        getMinGreaterThanSeven02(l);
        System.out.println("===============");

        getMinGreaterThanSeven03(l);
        System.out.println("============================");

        getHalfOfDistinctElementsInReversedOrder(l);
        System.out.println("============================");

        getHalfOfMinDistinctElementsInReversedOrder(l);
        System.out.println("============================");

        sumOfSquaresOfDistinctEvenElements(l);
        System.out.println("============================");

        productOfCubesOfDistinctEvenElements(l);

    }

    // 1 a) Create a method to print the list elements on the console in the same line with a space
    //      between two consecutive elements.(Structured)
    public static void printElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    // 1 b) Create a method to print the list elements on the console in the same line with a space
    //      between two consecutive elements.(Functional)
    public static void printElementsFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    // 2 a) Create a method to print the even list elements on the console in the same line with a space
    //      between two consecutive elements.(Structured)
    public static void printEvenElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    // 2 b) Create a method to print the even list elements on the console in the same line with a space
    //      between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); // 8 10 10 2 8
    }

    // 3) Create a method to print the square of odd list elements on the console in the same line with a
    //    space between two consecutive elements.(Functional)
    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    } // [8 9 131 10 9 10 2 8 15] ===> [9 131 9 15] ===> 81 17161 81 225

    // 4) Create a method to print the cube of distinct odd list elements on the console in the same line
    //    with a space between two consecutive elements.
    //    Elements should be distinct (unique)
    //    Elements should be odd
    //    Elements printed as cube
    public static void printCubeOfDistinctElements(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }  // 729 2248091 3375

    // 5) Create a method to find the maximum value from the list elements
    // 1. way
    public static void getMaxElement01(List<Integer> list) {
        Integer maxValue = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(maxValue);  // 131
    }

    // 2. way
    public static void getMaxElement02(List<Integer> list) {
        Integer maxValue = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(maxValue); // 131
    }

    // 6) Create a method to find the minimum value which is greater than 7 and even from the list
    //    more than 7, even, min value
    // 1. way
    public static void getMinGreaterThanSeven01(List<Integer> list) {
        Integer minGreaterThanSeven = list.stream().distinct().
                filter(t -> t > 7).filter(t -> t % 2 == 0).
                reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(minGreaterThanSeven);  // 8
    }

    // 2. way
    public static void getMinGreaterThanSeven02(List<Integer> list) {
        Integer minGreaterThanSeven = list.stream().distinct().
                filter(t -> t > 7).filter(t -> t % 2 == 0).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(minGreaterThanSeven);  // 8
    }

    // 3. way
    public static void getMinGreaterThanSeven03(List<Integer> list) {
        Integer minGreaterThanSeven = list.stream().distinct().
                filter(t -> t > 7).filter(t -> t % 2 == 0).
                sorted().
                findFirst().
                get();
        System.out.println(minGreaterThanSeven);  // 8
    }

    // 7 a) Create a method to find the half of the elements which are distinct and
    //      greater than 5 in reverse order in the list.
    //      distinct, half of the elements, greater than 5, reverse, list
    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {
        List<Double> newList = list.stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(newList);  // [65.5, 7.5, 5.0, 4.5, 4.0]
    }

    // 7 b) Create a method to find the half of the elements which are distinct and
    //      smaller than 10 in reverse order in the list.
    //      distinct, half of the elements, smaller than 10, reverse, list
    public static void getHalfOfMinDistinctElementsInReversedOrder(List<Integer> list) {
        List<Double> newList = list.stream().
                distinct().
                filter(t -> t < 10).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(newList);  // [4.5, 4.0, 1.0]
    }

    // 8) Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list) {
        Integer sum = list.stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum); // 168
    }

    // 9) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }
}














