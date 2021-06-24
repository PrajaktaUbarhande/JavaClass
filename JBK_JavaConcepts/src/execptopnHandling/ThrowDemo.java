package execptopnHandling;


public class ThrowDemo {

	 static void m1() throws NullPointerException{
		
		throw new NullPointerException();
	}
	
	 
	 static void m2() throws ClassNotFoundException{
		 
		 throw new ClassNotFoundException();
	 }
	 
	public static void main(String[] args) throws ClassNotFoundException {
		m1();
		m2();
	}

}
