package day30collections_tugba;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {

    public static void main(String[] args) {
         /*
          Set is a collection that is used for unique elements.
          Hash is a technique to create unique codes for each data
          HashSet is fast in operation because they do not use any specific order for data(insertion, natural)
          HashSet accepts null values.
         */
        HashSet <String> hs1 = new HashSet<>();
        hs1.add("K");
        hs1.add("K");
        hs1.add(null);
        hs1.add(null);
        System.out.println(hs1); // [null, K]
        System.out.println("****************************");

        HashSet<String> hs2 = new HashSet<>();
        hs2.add(null);
        hs2.add("K");
        System.out.println(hs2); // [null, K]
        System.out.println("****************************");

        System.out.println(hs1.equals(hs2)); // true
        System.out.println("****************************");

        // Interview Question: Type a code to display arrayList elements only once.
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);  // [5, 5, 2, 3, 2, 3, 5]
        System.out.println("****************************");

        HashSet<Integer> hs3 = new HashSet<>(list);
        hs3.addAll(list);
        System.out.println(hs3); // [2, 3, 5]
        System.out.println("****************************");

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add(null);  // null is object
        set.add("null");  // null is string
        set.add("B");
        System.out.println(set); // [null, A, B, null]
        System.out.println("****************************");
    }
}
