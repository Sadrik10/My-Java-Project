package day20interviewquestions;

public class Interview06 {

    public static void main(String[] args) {

        String str = "M ";

        str = str.concat("E ");

        String  add  = "S ";

        str = str.concat(add);
        System.out.println(str);

        str.replace("S" , "T"); // **** it does not change ****
        str = str.replace("S" , "T"); // **** it changes ****
        System.out.println(str);

        str = str.concat(add);
        System.out.println(str);

        System.out.println(str.replace("S", "Z"));
    }
}
