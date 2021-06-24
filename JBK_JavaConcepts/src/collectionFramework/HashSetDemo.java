package collectionFramework;


import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo 
{
//int,float,char-- primitive types
//Integer , Float , Character -- Wrapper classes for primitive types
// Collection is for objects not for primitive values like int , float
	
	public static void main(String[] args) 
	{
//ArrayList accepts duplicate values whereas HashSet does not
// ArrayList preseves insertion order , hashset no
		
		
		HashSet<Integer> al=new HashSet<Integer>();
		
		//  [ 10 ]  Integer class object
		
		System.out.println(al.add(10)); // it is converted into al.add(new Integer(10))
		
		System.out.println(al.add(10));;
		
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		
	}
	
	
	
	
}
