package day33mapsanditerators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {
        List<String > list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
//        for (String w: list1){
//          list1.remove(w);
//        }
//        list1.remove("A");  // It gives ===> "ConcurrentModificationException"

        System.out.println(list1); // [A, B, C]

        ListIterator list1Itr = list1.listIterator();
//        while (list1Itr.hasNext()){
//            Object element =  list1Itr.next();
//            list1Itr.set(element+"EEE");

//      // When we use Iterator, we can modify all elements of a list at the same time
//      // We cannot do modification with For each loop, but we can read the date with for each loop
//        }
//        System.out.println(list1);   // [AEEE, BEEE, CEEE]

        ListIterator list2Itr = list1.listIterator();

        while (list2Itr.hasNext()){
            Object element = list2Itr.next();
            if(element.toString().equalsIgnoreCase("C")){
                list2Itr.remove();
            }
        }
        System.out.println(list1);  // [A, B]
    }
}