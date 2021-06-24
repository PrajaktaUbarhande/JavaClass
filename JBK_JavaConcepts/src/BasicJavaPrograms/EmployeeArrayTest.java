package BasicJavaPrograms;

import java.util.Scanner;


class Employee {
	int empNo , empSalary ;
	
	  Employee( int n , int s)  {
		 
		    empNo = n;
		    empSalary  = s;
		  
		}// end Constructor
		
	public String toString() {
		return empNo + " " +empSalary;
		
	}
	
}
public class EmployeeArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employee you want to add : ");
		int size = sc.nextInt();
		Employee[] employees = new Employee[size];
		
		for (int i = 0; i < size; i++) 
		{
			System.out.println("Enter empNumber :");
			int eno = sc.nextInt();
			System.out.println("Enter empSalary :");
			int esalary = sc.nextInt();
			employees[i] = new Employee(eno, esalary);	
		}
		
//	for (Employee empObject : employees) 
//	{		System.out.println("Employee details is : "  + empObject);
//	}

	 int max = 0, max1 = 0 ;
	 for ( int j = 0 ; j<employees.length;j++){
		if(employees[j].empSalary  > max)
		{
			max = employees[j].empSalary;
			max1 = employees[j].empNo;
			System.out.println("employee max details is : "  + employees[j]);
		}

}
	System.out.println("Greter Employee Number  :" +max1);
	System.out.println("Greter Employee salary  :" +max);	
	
	}

}
