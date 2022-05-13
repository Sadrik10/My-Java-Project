package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        String fullName = (firstName + " " + lastName); //To get String data from user use nextLine() method
        System.out.println("The user's name is " + fullName);
    }
}