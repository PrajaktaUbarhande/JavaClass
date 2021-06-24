package execptopnHandling;

public class A {

	public static void main(String[] args) {
		
		
		//System.out.println(10/0); //
		try {
			
		System.out.println(10/0);
		System.exit(0);
		
		}
		
		catch(Exception e) 
		{
			e.printStackTrace();
			//System.out.println("Exception Handled.........");
		}
//		catch(ArithmeticException a) 
//		{
//			
//			System.out.println("Divide By Zero");
//		}
//		
		
		finally 
		{
			
			System.out.println("Finally Block Executed");
		}
		
		
		System.out.println("I am not guilty .. Please execuse");	

	}

}
