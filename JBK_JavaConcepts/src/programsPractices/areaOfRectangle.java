package programsPractices;

import java.util.Scanner;

public class areaOfRectangle {

	public static void main(String[] args) {
		
		
		//************* Dayamic Way **********************
	
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Enter Length of rectangle is :");
		
		   double length = sc.nextDouble();
		   
		System.out.println( "Enter Width of the rectangle is :");
		
		   double width = sc.nextDouble();
		   
		 double area = length*width ;
		 
		System.out.println( "Area of Rectangle is :" + area);
		
		
		// ************ Static Program ****************
		
//		 double length = 4.5 ;
//		 
//		 double width = 8.0;
//		 
//		 double area = length * width ;
//		 
//		 System.out.println("Area of rectangle is :" + area);
//		
		
		
	}

}
