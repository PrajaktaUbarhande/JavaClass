package p4;

public class A {

 public static int a =10 ;
	
	public static void main(String[] args) {
		
    System.out.println(a);
	}

} // class A end


class B{
	
	public static void main(String[] args) {
		
		System.out.println(A.a);
		
		
	}
}

// Private used only class 
// Protected use limit only Packages
// default use use for pacakges