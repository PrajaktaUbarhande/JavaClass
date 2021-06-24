package BasicJavaPrograms;

public class A {

	public static void main(String[] args) {
	
		 int[] a = { 10 ,20 };
		 String[] s = { "Java" , "c" };
		 B.main(s);
		

	}

}// Class A end 

 class B {
	
	public static void main(String[] s) {
		
		
		for(String object : s ) {
			System.out.println(" Printing Array : " +object);
		}// end for each loop 
		
		
		
		
	}
	
	
	
}// class B end
