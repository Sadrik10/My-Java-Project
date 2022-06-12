package day24objectmanipulations_is;

public class MainRunner42 {

    /*
    ask user to type 3 names and 3 lastnames
    Then concatenate the names with lastnames and add also "@gmail.com"
    Finally print them on the console
     */

    public static void main(String[] args) {
/*
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Fuat", "Koca");//0
        Person person2 = new Person("Cagri", "Selcuk");//1
        Person person3 = new Person("Cigdem", "Bakar");//2

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

        List<String> emails = generateEmails(people);

        System.out.println("First Email: "+emails.get(0));
        System.out.println("Second Email: "+emails.get(1));
        System.out.println("Third email: "+emails.get(2));
    }

    public static List<String> generateEmails(List<Person> people){

        List<String> emails = new ArrayList<>();

//        System.out.println("email1: "+ people.get(0).name+ people.get(0).lastname+"@gmail.com");
//        System.out.println("email2: "+people.get(1).name+people.get(1).lastname+"@gmail.com");
//        System.out.println("email3: "+people.get(2).name+people.get(2).lastname+"@gmail.com");

        for(Person eachPerson:  people){
            emails.add((eachPerson.name+eachPerson.lastname+"@gmail.com").toLowerCase()); // 2
        }
        return emails;

    }

 */

    }
}