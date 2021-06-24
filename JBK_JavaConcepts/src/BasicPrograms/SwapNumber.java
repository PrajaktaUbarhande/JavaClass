package BasicPrograms;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		// ************Without using 3rd variable ****************

		/*
		 * Scanner sc = new Scanner (System.in);
		 * System.out.println(" Enter First Number :"); int a = sc.nextInt();
		 * System.out.println(" Enter Second Number :"); int b = sc.nextInt();
		 * System.out.println("Given Number is Before sawpping " + a + " " + b); a = a+b
		 * ; b = a-b; a = a-b ;
		 * 
		 * System.out.println("Given Number After swapping "+a + " " + b);
		 */

// ********* Using 3rd Variable **********

		int a = 10, b = 20, c;
		System.out.println("Before swapping given number is : " + a + " " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping Given Number is  : " + a + " " + b);

	}

}
