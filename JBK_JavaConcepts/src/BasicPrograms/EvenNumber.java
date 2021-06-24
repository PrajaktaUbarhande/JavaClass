package BasicPrograms;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
	 
		//****** checking Given Number is EVEN or ODD *********
		
		Scanner scan = new Scanner ( System.in);
		System.out.println(" Enter Number Here : ");
		int number = scan.nextInt();
		 if ( number %2 == 0)
		 { 
		 System.out.println(" Given number is Even"); 
		 } 
		 else 
		 {
		 System.out.println(" Given number is ODD"); 
		 }
		 
		
		
		// ********** print 1 to 10 even Number  using for loop***********
		
		/*
		 * for ( int i =0 ; i <=10 ; i++) {
		 * 
		 * if ( i %2 == 0) { System.out.println(i); } }
		 */
		
		
		/*
		 * // ******** Print 1 to 10 Even Number Using while loop **** int i=1;
		 * System.out.println("Even numbers"); while(i<=10) { if (i%2==0) {
		 * System.out.println(i);
		 * 
		 * } i++; }
		 */
		
	}

}
