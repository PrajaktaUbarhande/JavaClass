package ConstuctorConcepts;

public class Employee {
	
	int empNo , empSalary ;
	
  Employee( int n , int s)  {
	 
	    empNo = n;
	    empSalary  = s;
	  
	}// end Constructor
	
public String toString() {
	return empNo + " " +empSalary;
	
}

}
