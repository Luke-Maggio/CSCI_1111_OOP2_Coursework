package programming18_9;

import java.util.Scanner;

public class Exercise18_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String string = input.next();
		
		reverseDisplay(string);
	}
	
	public static void reverseDisplay(String string) {
		if (string.isEmpty() || string.length() == 0) {
			return;
		}
		System.out.print(string.charAt(string.length() - 1));
		string = string.substring(0, string.length() - 1);
		reverseDisplay(string);
		
	}

}
