package lambda_functional_programming;

public class Utils {
    public static void printInSameLineWithSpace(Object o){
        System.out.print(o + " ");
    }
    public static boolean checkToBeEven(int x){
        return  x % 2 == 0;
    }
    public static boolean checkToBeOdd(int x){
        return  x % 2 != 0;
    }
    public static int getSquare(int x){
        return  x * x;
    }
    public static boolean getNumbersMoreThanEight(int x){
      return x > 8;
    }
    public static void printElementsWithAStar(Object o){
        System.out.println(o + " *");
    }
    // Utils :: printElementsWithAStar
    public static int getCube(int x){
        return x * x * x;
    }
    public static double getHalfOfElement(int x){
        return x / 2.0;
    }
    public static char getLastChar(String str){
        return  str.charAt(str.length() - 1);
    }
}
