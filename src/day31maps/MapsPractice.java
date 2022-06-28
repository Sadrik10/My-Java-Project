package day31maps;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
    /*
    Map FruitCalories = new HashMap<>();
        FruitCalories.put("apple",95);   // map is not inherit from collections that's why we can't use ADD method here
        FruitCalories.put("lemon",20);
        FruitCalories.put("banana",105);
        FruitCalories.put("orange",45);
        FruitCalories.put("lemon",17);
     */
    public static void main(String[] args) {

        Map FruitCalories = new HashMap<>();
        FruitCalories.put("apple",95);  // map is not inherit from collections that's why we can't use ADD method here
        FruitCalories.put("lemon",20);
        FruitCalories.put("banana",115);
        FruitCalories.put("orange",45);
        FruitCalories.put("lemon",17);

        System.out.println(FruitCalories); // {banana=105, orange=45, apple=95, lemon=17}

        // !! 2.Way of adding element to Map    ==>
        Map FruitCalories2 =Map.of("plum",30,"pear",70,"apple",95);
        System.out.println(FruitCalories2); // {plum=30, apple=95, pear=70}

        System.out.println(FruitCalories.size());
        System.out.println(FruitCalories); // {banana=105, orange=45, apple=95, lemon=17}
        System.out.println(FruitCalories.entrySet()); // [banana=105, orange=45, apple=95, lemon=17]

        System.out.println(FruitCalories.get("apple"));
        System.out.println(FruitCalories.getOrDefault("plum", "not in the map"));
        System.out.println(FruitCalories.keySet());
        System.out.println(FruitCalories.values());
        System.out.println(FruitCalories.remove("lemon"));
        System.out.println(FruitCalories);
        System.out.println(FruitCalories.containsKey("watermelon"));
        FruitCalories.replace("apple",70);
        System.out.println(FruitCalories);
    }
}
