package day24objectmanipulations_is;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.next();

        System.out.println("Last name: ");
        String lastname = scan.next();

        email(name+lastname+"@gmail.com");
}
    public static void email(String mail){
        System.out.println(mail);
    }
}
