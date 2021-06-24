package execptopnHandling;

import BasicJavaPrograms.StsticMethod;

public class B {

	
	static String s;  // Null Pointer Exception 
	
	
	static void a() throws NullPointerException
	{
		//String s = null; // O/p NullPointerException
		
	     s = new String("Hello"); // o/p 5
		
		System.out.println(s.length());
	}
	
}// class end 

class Test{
	
	public static void main(String[] args) {
		B.a();
		System.out.println("Fine");
		
	}
	
}
