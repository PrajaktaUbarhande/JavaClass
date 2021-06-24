package collectionFramework;

/* sorting string objects in increasing order of length of string
 
 
 if string length is similar , then sorts them in desceding order
 
 * */
import java.util.TreeSet;

public class StringSorting {
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
	TreeSet<String> treeset = new TreeSet<String>(
			(s1,s2) -> {
				if(s1.length()==s2.length())
					return - s1.compareTo(s2);
				else if (s1.length() > s2.length())
					return 10;
				else 
					return -1;
				
			
			}
	
			
			);
	
	treeset.add("java");
	treeset.add("by");
	treeset.add("hi");
	treeset.add("kiran");
		
	
	System.out.println(treeset);
	}

}
