package programsPractices;

import java.util.Scanner;

public class areaOfSquare {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Side length of Square :");
		
	      double  side = sc.nextDouble();
	      
	      double area = side* side ;
	      
	     System.out.println("Area of Square is :" +area);
		 
	}

}
