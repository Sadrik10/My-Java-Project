package day24objectmanipulations_is;

import java.util.ArrayList;
import java.util.List;

public class MainRunner4 {
    /*
    ask user to type 3 names and 3 lastnames
    Then concatenate the names with lastnames and add also "@gmail.com"
    Finally print them on the console
     */

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Fuat", "Koca");    // 0
        Person person2 = new Person("Cagri", "Selcuk"); // 1
        Person person3 = new Person("Cigdem", "Bakar"); // 2

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.size());

//        for(Person person : people){
//            System.out.println(person.name);
//            System.out.println(person.lastname);
//        }

//        for(int i=0; i< people.size(); i++){
//            System.out.println(people.get(i).name);
//            System.out.println(people.get(i).lastname);
//        }
    }
}
