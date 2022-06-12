package day24objectmanipulations_is;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 {
    /*
    Ask user to type 2 names and 2 lastnames
    Then concatenate them to create emails
    use @gmail.com at the end
     */
    public static void main(String[] args) {

        List<String> names = new ArrayList();
        List<String> lastnames = new ArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type 2 names");
        names.add(scan.nextLine());
        names.add(scan.nextLine());

        System.out.println("Please type 2 lastnames");
        lastnames.add(scan.nextLine());
        lastnames.add(scan.nextLine());

        System.out.println("user names: " + names);
        System.out.println("user lastnames: " + lastnames);

        System.out.println("email ids: "+ generateEmail(names, lastnames));
    }
    public static List<String>  generateEmail(List<String> names, List<String> lastnames){
        List<String> emails = new ArrayList<>();

        // 1. way
        // Ali => 0               Can => 0 => alican
//         emails.add(names.get(0)+lastnames.get(0)+"@gmail.com" );
        // Veli => 1        Han=> 1    velihan + @gmail.com
//         emails.add(names.get(1)+lastnames.get(1)+"@gmail.com");
//         return emails;

        // 2. way
        for(int i=0; i< names.size(); i++ ){
            emails.add(names.get(i)+lastnames.get(i)+"@gmail.com");
        } return emails;
    }
}
