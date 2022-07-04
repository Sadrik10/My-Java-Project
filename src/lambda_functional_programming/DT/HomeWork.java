package lambda_functional_programming.DT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeWork {

    // 6) Homework: Create a method to find the minimum value from the list elements(In 2 ways)

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        getMinElement01(l);
        getMinElement02(l);
        getMinElement03(l);
    }
    public static void getMinElement01(List<Integer> list) {
        Integer minValue = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(minValue);
    }
    public static void getMinElement02(List<Integer> list) {
        Integer minValue = list.stream().distinct().sorted().findFirst().get();
        System.out.println(minValue);
    }
    public static void getMinElement03(List<Integer> list) {
        Integer minValue = list.stream().distinct().
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(minValue);
    }
}

