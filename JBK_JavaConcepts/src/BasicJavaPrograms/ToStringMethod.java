package BasicJavaPrograms;

import java.util.Scanner;

public class ToStringMethod {

	int empNumber, empSalary;
	
//*************** Constructor Calling ****************

	public ToStringMethod(int no, int salary) {

		empNumber = no;
		empSalary = salary;
		
	} // Constructor End 

// ************** Overriding Method using toString() ************
	public String toString() {
		return empNumber + " " + empSalary;

	}

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
	
		ToStringMethod[] emp = new ToStringMethod[2];
		
		/*
		 * for(int i =0 ; i <emp.length ; i++) {
		 * System.out.println(" Enter Employee Numner : "); }
		 */

		ToStringMethod emp1 = new ToStringMethod(1, 1000);
		ToStringMethod emp2 = new ToStringMethod(2, 2000);

		emp[0] = emp1;
		emp[1] = emp2;

		System.out.println(emp[0]);
		System.out.println(emp[1]);
	}

}

// without overriding output is = BasicJavaPrograms.ToStringMethod@2401f4c3
//BasicJavaPrograms.ToStringMethod@41a4555e
