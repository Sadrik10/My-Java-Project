package aExamples;

public class Anagram01 {

        /*	Ask user to enter 2 Strings. If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
            Otherwise, print "Not Anagram" on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.
        */
      public static void main(String[] args) {

		findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

		System.out.println("===========");

		findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
	}
	  public static void findPairs(int arr[], int num) {

		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {

				if(arr[i]+arr[j]==num) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + num );
				}
			}
		}
	}
}

