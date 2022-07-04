package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp04 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        printInUpperCase01(l);
        System.out.println("\n========================================================================");
//        printInUpperCase02(l);
        printTheElementsOrderedBasedOnLength(l);
        System.out.println("\n========================================================================");
        printTheElementsOrderedBasedOnLength02(l);
        System.out.println("\n========================================================================");
        printDistinctElementsSortedByLastChar(l);
        System.out.println("\n========================================================================");
        printAllElementsByTheirLengthAndFirstInitialChars(l);
        System.out.println("\n========================================================================");
//        removeTheElementsWhoseLengthGreaterThanFive(l);
        removeElementsLengthInBetween8And10OrEndsWithO(l);
    }
    // 1) Create a method to print all list elements in uppercase in the same line with a space
    // 1. Way
    public static void printInUpperCase01(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::printInSameLineWithSpace);
    }
    //1) Create a method to print all list elements in uppercase in the same line with a space
//    // 2. Way
//    public static void printInUpperCase02(List<String> list){
//        list.replaceAll(String::toUpperCase);
//        System.out.println(list);
//    }

    // 2) Create a method to print the elements after ordering according to their lengths
    public static void printTheElementsOrderedBasedOnLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithSpace);
    }

    // 3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printTheElementsOrderedBasedOnLength02(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithSpace);
    }

    // 4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctElementsSortedByLastChar(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils ::getLastChar)).forEach(Utils::printInSameLineWithSpace);
    }

    // 5) Create a method to sort the elements according to their lengths then according to their first character
    public static void printAllElementsByTheirLengthAndFirstInitialChars(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(Utils::printInSameLineWithSpace);
    }

    // 6) Remove the elements if the length of the element is greater than 5
//        public static void removeTheElementsWhoseLengthGreaterThanFive(List<String> list){
//        list.removeIf(t -> t.length() > 5);
//        System.out.println(list);
//    }

    // 8) Remove the elements if the length is between 8 and 10 or ending with 'o'
    public static void removeElementsLengthInBetween8And10OrEndsWithO(List<String> list){
        Predicate<String > checkCondition = t -> (t.length() > 7 && t.length() < 11) || t.endsWith("o");
        list.removeIf(t -> checkCondition.test(t));
        System.out.println(list);
    }
}

