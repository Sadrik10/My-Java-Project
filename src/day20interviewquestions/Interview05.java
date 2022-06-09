package day20interviewquestions;

public class Interview05 {

    public static void main(String[] args) {

        int num = 10;
        do { //              10
            System.out.print(num-- + " "); // 10
            // 8
        } while (--num == 0);

        System.out.println(num); // 10 8
    }
    /*
      What is the result?
      A) 543210
      B) 9
      C) 421
      D) 10
      E) Nothing is printed
   */
}

