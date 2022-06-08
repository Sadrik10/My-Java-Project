package day19passbyvaluedatetimeclasses;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {

        Integer arr[] = {3, 4, 5, 6};

        // When you create a list from array by using "asList()", the list will be fixed in length.
        List<Integer> list = Arrays.asList(arr);

        // Try to remove an element from list
//         list.remove(1);        WHEN THE USING asList MEDTOD WITH LIST.REMOVE METHOD   ***** JAVA GIVES ERROR *****
//         System.out.println(list);

        // Try to add an element into the list
//         list.add(7);          WHEN THE USING asList MEDTOD WITH LIST.ADD METHOD   ***** JAVA GIVES ERROR *****
//         System.out.println(list);

        // Try to delete all elements from the list
        // list.clear();         WHEN THE USING asList MEDTOD WITH LIST.CLEAR METHOD   ***** JAVA GIVES ERROR *****
        System.out.println(list);
    }
}
