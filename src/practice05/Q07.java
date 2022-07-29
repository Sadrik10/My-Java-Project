package practice05;

public class Q07 {

    public static void main(String[] args) {

        // Write a code that adds given integers except the first one
        // and multiplies with the first integer.

        method(1,2,3,4,5,6); // 20 = 1*(2+3+4+5+6)
        method(8,1);         // 8 = 8*1
        method(5,1,2,3,4,5); // 75 = 5*(1+2+3+4+5)

    }
    public static void method(int first, int... numbers){
        int sum = 0;
        for(int each : numbers){
            sum = sum + each;
        }
        int result = first * sum;
        System.out.println(result);
    }
}
