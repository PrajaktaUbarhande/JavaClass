package BasicJavaPrograms;

import java.util.Scanner;

public class TestArray {
	
	int empNumber, empSalary;
	
	//*************** Constructor Calling ****************

		public TestArray(int no, int salary) {

			empNumber = no;
			empSalary = salary;
			
		} // Constructor End 

	// ************** Overriding Method using toString() ************
		public String toString() {
			return empNumber + " " + empSalary;

		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( " Enter Size of Array elements : ");
		int size = sc.nextInt();
		TestArray[] emps = new TestArray[size];
		
		for ( int i = 0 ; i < emps.length ; i++) {
			
			System.out.println(" Enter employee Number : ");
			int empNumber = sc.nextInt();
			
			System.out.println(" Enetr Employee salary : ");
			int empsalary = sc.nextInt();
			
			TestArray obj = new TestArray(empNumber , empsalary);
			emps [i]  = obj ;
			
		} // end for loop
		
		
		 System.out.println( " Details of employees is ");
			/*
			 * for ( TestArray object : emps ) { System.out.println(object); } // end for
			 * each loop
			 */
		 
		 for ( int j  = 0 ; j <emps.length ; j++) {
			 
		     System.out.println(emps [j]) ;
			 
		 } // end for loop  ,using for loop 
		
	}

}
