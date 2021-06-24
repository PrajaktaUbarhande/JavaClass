package Loops;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int i = 1;

		while (i <= 3) {

			fact = fact * i;
			i++;
		}

		System.out.println("Factorial of 3 is : " + fact);
	}

}// class end 
