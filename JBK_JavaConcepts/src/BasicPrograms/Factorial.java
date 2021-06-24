package BasicPrograms;

public class Factorial {

	public static void main(String[] args) {
		
		int i = 1;
		int fact = 1 ;
		
	// using while loop 	
		
		/*
		 * while(i <= 3) {
		 * 
		 * fact = fact * i; i++ ;
		 * 
		 * } System.out.println(fact);
		 */
		
	// Using For Loop 
		for (i=1;i<=3;i++) {
			
			fact = fact * i;
		}
		System.out.println(fact);
		
	}

}
