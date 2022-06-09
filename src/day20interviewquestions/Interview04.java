package day20interviewquestions;

import java.util.Scanner;

public class Interview04 {

    /*
            Ebay Interview Questions
   Get a String and a character from user
   Count the number of characters between the first occurence and the last occurence of the given character in the String
   Do not count the space characters
   If the character which user selected is displayed just once in the String return -1
   If the character which user selected does not exist in the String return -1
   For example; "Java is easy" - 'a' ==> 5
                "Java is easy" - 'w' ==> -1
                "Java is easy" - 'e' ==> -1
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a String value..");

        String str = scan.nextLine();

        // 1       9
        //Java is easy => 3

        // w

        // 1 String    / 1 character

        System.out.println("Please Enter a character");
        char ch = scan.next().charAt(0);

        // -1
        int firstOccIndex = str.indexOf(ch);
        //-1
        int lastOccIndex = str.lastIndexOf(ch);

        int counter = 0;

        if(firstOccIndex == lastOccIndex){
            System.out.println(-1);
        }else{

            // Java is easy
            for(int i = firstOccIndex +1; i < lastOccIndex; i++ ){

                if(str.charAt(i) != ' '){
                    counter++;
                }
            }
        }
        System.out.println("Number of chars accuring inbetween given chars " +counter);
    }
}

