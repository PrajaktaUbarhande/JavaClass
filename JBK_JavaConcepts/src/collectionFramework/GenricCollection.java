package collectionFramework;

import java.util.ArrayList;
import java.util.function.Consumer;

public class GenricCollection {
	
	
	public static void main(String[] args) {
		
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 
		 
		
		 
		// al.add("jabd"); Not allowed 
		 
	
//		 
//		 Integer i = al.get(0);
//		 System.out.println( "Array List Index O Value is :" +i);
//		 
//		 
		// al.set(0,30);  // set valuse index and vaulue 
		 
//		 Integer i1 = al.get(0);
//		 System.out.println( "Array List set value  :" +i1);
		 
		 // Unboxing 
		// int a= i.intValue();
		 //System.out.println("Unvboxing ArrayList Index is :" + a );
//		 
//		 al.remove(0); // remove element 
//		 System.out.println( "Array List Index O Value is :" +al);
		 
//		 Integer i2 = al.get(2);
//		 System.out.println( "Array List Index O Value is :" +i2);
//		 
//		 
		
		 
//		 for ( int index = 0 ; index <al.size() ; index++) {
//			 
//			 System.out.println(al.get(index));
//		 }
		 
		 
		 for( Integer intObj : al) {
			 
			 System.out.print(intObj);
			
			 
			
		 }
		 
	}
	

}
