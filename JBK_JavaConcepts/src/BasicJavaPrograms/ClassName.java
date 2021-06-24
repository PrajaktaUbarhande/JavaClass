package BasicJavaPrograms;

public class ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int[] a = new int[3];		
			System.out.println(a.getClass().getName());
			
			String p =  new String ("Hello");
			System.out.println(p.getClass().getName());
			
			System.out.println(p instanceof String ); // p is pointing to Sting of object
			
			Object o = new Object();
			System.out.println(o instanceof Integer);
		
	}
}
