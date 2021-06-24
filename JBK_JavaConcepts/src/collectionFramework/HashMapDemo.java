package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

// HashMap is used to store key and value pair of objects .
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
// Here we are storing rollnumber and name of a student in a HashMap
		
		HashMap<Integer, String>  hm = new HashMap<Integer, String>();
		
		hm.put(1, "anil");
		
		hm.put(1, "ramesh");// old value is replaced by new value if key is already present
		
		hm.put(2, "akash");
		
		hm.put(3, "abhijit");
		
		
		
		System.out.println(hm);
		
		System.out.println("Enter rollnumber whose name you want ? ");
		int rollnumber=sc.nextInt();
		
		String name=hm.get(rollnumber);

		System.out.println("Name of roll number " + rollnumber + " is " + name);
		
		Set<Integer>  allKeys=hm.keySet();//[1,2,3] allkeys is set having Integer class objects ( key ) 
		
		for(Integer key : allKeys)
		{
			String value=hm.get(key);
			
			System.out.println(key + " " + value);
		}
		
		hm.remove(1);
		
		System.out.println("HashMap after deleting entry of roll number 1 ");
		
		System.out.println(hm);
		
		Collection<String>  values=hm.values();
		
		for(String value : values)
			System.out.println(value);
		
	
	    Set<Entry<Integer,String>>  entries=hm.entrySet();
	    
	    for(Entry<Integer,String>  entry : entries)
	    	System.out.println(entry.getKey() + " " + entry.getValue());
	    
	    
	    
	    
	    
	
	
	}
}
