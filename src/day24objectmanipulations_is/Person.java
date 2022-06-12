package day24objectmanipulations_is;

public class Person {

    private String name;
    private String lastname;
    private int id;
    private int age;
    private double salary;

    public Person (){

    }   //name  // name

    public Person (String name,String lastname){
        this.name = name;
        this.lastname = lastname;
//         Wael             Wael
    }

    public static void main(String[] args) {
        Person person = new Person("Maha", "Wael");

        System.out.println(person.name);
        System.out.println(person.lastname);
    }
}
