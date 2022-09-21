import java.util.Scanner;
public class Exercise06_23 {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner in = new Scanner(System.in);
		
		// get the users string
		System.out.print("Enter a string: ");
		String string = in.nextLine();
		
		// ask user to enter character to search for.
		System.out.print("Enter a character: ");
		char ch = in.next().charAt(0);
		
		// Output the results and call the count method
		System.out.println("The number of occurences of " + ch + " in " + string + " is " + countOfChar(string, ch));

	}
	
	// Create a method that count the occurence of a character in a string
	public static int countOfChar(String str, char a) {
		
		// declare and initialize an accumulator 
		int count = 0;
		
		// loop through the string index to find occurences of a character
		for (int i = 0; i < str.length(); i++) {
		    if (a == str.charAt(i))
	  	        count ++;
		}
		return count;
	}

}
