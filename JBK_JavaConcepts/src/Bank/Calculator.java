package Bank;

public class Calculator {

	int elementA, elementB;
	
	Calculator(int a, int b) {  

		elementA = a;
		elementB = b;

	} // Constructor end

	int add(int a, int b)  // Addition Method
	{   
		return a + b;

	}

	int sub(int a, int b)   // Subtraction Method
	{  
		return a - b;

	}

	int mul(int a, int b)   // Multiplication Method
	{  
		return a * b;

	}

	int div(int a, int b)  //// Division Method
	{  
		return a / b;

	}

	void display() {

		System.out.println(" First Given number  : " + elementA);
		System.out.println(" Second Given number : " + elementB);
		System.out.println("\n---------------------------------------\n");

	}

	

}// class Calculator end

class Calc {

	public static void main(String[] args) {

		Calculator calc = new Calculator(20, 10);
		
		calc.display(); // display given number using display method and constructor calling

 
		// addition on two number
		int addition = calc.add(20, 10);  

		System.out.println("Addition of given Number : " + addition);

		// Subtraction of two given number
		int subtraction = calc.sub(20, 10);  

		System.out.println("Subtraction of given Number : " + subtraction);

		// Multiplication of given number
		int multiplication = calc.mul(20, 10);  

		System.out.println("Multiplication of given Number : " + multiplication);

		// Division of given number
		int division = calc.div(20, 10);  

		System.out.println("Division of given Number : " + division);

	}
}// class Calc or main class  end
