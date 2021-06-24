package multiThreading;


public class StudentT {

	   void m1() {
		   
		   System.out.println("Hello Student ");
	   }
	   
	   
	   void m2() {
		   
		   System.out.println( "Student Hello");
	   }
	
	  static StudentT getStudent() {
		
		  return  new StudentT ();
		  	  
	  }
	
	
	public static void main(String[] args) {
		
		
		StudentT.getStudent().m1();  // used only run only one method 
		
		
		StudentT std = new StudentT();  // for Running Multiple Method
		
		std.m2();
		
		
	}

}
