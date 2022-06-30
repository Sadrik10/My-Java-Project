package day33mapsanditerators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterators03 {

    public static void main(String[] args) {
        // We have also Iterator
        /*
           1) when we use Iterator, we will NOT have hasPrevious or previous methods
           2) we can use ListIterator only with lists in Java, but Iterator can be used for all collections
        */
        Set<String > set = new HashSet<>();
        set.add("Ali");
        set.add("Veli");
        set.add("Ayse");
        Iterator iter = set.iterator();

        while (iter.hasNext()){
            iter.next();
            iter.remove();
        }
        System.out.println(set);
    }
}

