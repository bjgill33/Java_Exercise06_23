import java.util.Scanner;
public class Exercise06_23 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = in.nextLine();
		
		System.out.print("Enter a character: ");
		char ch = in.next().charAt(0);
		
		System.out.println("The number of occurences of " + ch + " in " + string + " is " + count(string, ch));

	}
	
	public static int count(String str, char a) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (a == str.charAt(i))
				count ++;
		}
		return count;
	}

}
