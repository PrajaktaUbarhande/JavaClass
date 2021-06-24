package Loops;

public class PrimeDemo {
	public static void main(String[] args) {

		int num = 5;
		boolean flag = true;

		for (int i = 2; i < num; i = i + 1) {
			if (num % i == 0) {
				flag = false;
				break;
			} // if ends

		} // for loop

		if (flag) {
			System.out.println(num + " is a prime number ");
		}

		else {
			System.out.println(num + " is not a prime  number ");
		}

	}// main ends
}
