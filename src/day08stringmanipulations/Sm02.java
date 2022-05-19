package day08stringmanipulations;

public class Sm02 {

    public static void main(String[] args) {

        String fullName = "    Ali Can   ";
        System.out.println(fullName); //    Ali Can

        String trimmedName = fullName.trim();
        System.out.println(trimmedName); //Ali Can

        // How can I understand if a string is empty or not?

        int numOfChar = fullName.length();
        if(numOfChar==0){
            System.out.println("You did not enter your name..");
        } else {
            System.out.println("You entered your name..");
        }

        // isEmpty() returns true if there is no character
        String fullName1 = "    ";
        boolean isEmpty = fullName1.isEmpty(); // Space characters are not empty. Therefore boolean is false.
        System.out.println(isEmpty);

        // isBlank() returns true, if there are space characters or a space character or empty.
        // For that 3 scenarios isBlank() is used.

        boolean isBlank = fullName1.isBlank();
        System.out.println(isBlank);












    }

}
