package day26exception;

public class E03 {

    public static void main(String[] args) {

        String str = "";
        getNumOfCharactersInAString(str); // 0

        String s = "Ali Can";
        getNumOfCharactersInAString(s);   // 7

        String name = "SadrettinAkkoyun";  // 16
        getNumOfCharactersInAString(name);

        String t = null;
        getNumOfCharactersInAString(t);   // NullPointerException
}
    public static void getNumOfCharactersInAString(String str){
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
                                                                                                  // null
            System.out.println("Issue occurred when I want to count the number of characters " + e.getMessage());
            System.err.println("**** Issue occurred when I count the number of characters ****");
            e.printStackTrace();  // If you want to see details about the issue, you can use printStackTrace()
        }
    }
}
