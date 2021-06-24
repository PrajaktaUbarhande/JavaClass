package BasicJavaPrograms;

public class Emp {

	int empNo , empSalary ;
	
	public String toString() {
		return empNo + " " + empSalary;
		
	}
	Emp(int no , int salary){
		
		empNo = no ;
		empSalary = salary;
		
	} // Constructor End 
	
	public static void main(String[] args) {
	
     Emp obj = new Emp(1 ,1000);
     System.out.println(obj);
	}

}
