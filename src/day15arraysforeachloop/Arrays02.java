package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Check if the array elements are in the natural order.
        // "A", "B", "C" ==> true
        // "A", "C", "B" ==> false

        // Correct Solution 1
        String srr[] = {"Ayhan", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(srr));

        System.out.println("=========== *** Correct Solution 1 *** ===============");

        // Create a new array and put the elements into the new array
        String trr[] = new String[3];

        // If you want to keep original array same, transfer the elements one by one by using for loop
        // By using for loop you will have same elements in 2 different reserved area

        for(int i=0; i<3; i++){   // There is for loop. After for loop we have 2 arrays areas.
            trr[i] = srr[i];
        }
        System.out.println("Before sort: " + Arrays.toString(trr));
        Arrays.sort(trr);
        System.out.println("After sort: " + Arrays.toString(trr));

        if(Arrays.equals(srr,trr)){
            System.out.println("Array elements are in natural order");
        }else{
            System.out.println("Array elements are not in natural order");
        }

        System.out.println("=========== *** Correct Solution 2 *** ===============");

        // Correct Solution 2
        String mrr[] = {"Ayhan", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(mrr));

        // If you want to keep original array same, use the copyOf() method
        // By using copyOf() method you will have same elements in 2 different reserved area

        String nrr[] = Arrays.copyOf(mrr, 3);   // There is Arrays.copyOf method
        Arrays.sort(nrr);

        if(Arrays.equals(mrr,nrr)){
            System.out.println("Array elements are in natural order");
        }else{
            System.out.println("Array elements are not in natural order");
        }

        System.out.println("=========== *** Wrong Solution *** ===============");

        // Wrong solution
        String urr[] = {"Ayhan", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(urr));

        // If you assign an array into another array they will use same reserved area, do not forget!!!

        String prr[] = urr;
        Arrays.sort(prr);
        System.out.println(Arrays.toString(prr));

        if(Arrays.equals(urr,prr)){
            System.out.println("==> Array elements are in natural order");
        }else{
            System.out.println("==> Array elements are not in natural order");
        }

    }

}
