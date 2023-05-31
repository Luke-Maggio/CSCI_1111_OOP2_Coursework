package programming18_3;

import java.util.Scanner;

public class Exercise18_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two non-negative integers: ");
		int one = input.nextInt();
		int two = input.nextInt();
		
		System.out.println("The GCD of " + one + " and " + two + " is " + GCD( one, two));
	}

	private static int GCD(int one, int two) {
	if (one%two == 0)
		return two;
	else 
		return GCD(two, one % two);
	}
}
