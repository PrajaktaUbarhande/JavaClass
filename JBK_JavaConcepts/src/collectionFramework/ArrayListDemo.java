package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

 class ArrayListDemo {

	public static void main(String[] args) {
		
		 ArrayList al = new ArrayList();
		 
		 al.add(10);
		 
		 al.add("jbk");
		 
		 al.add(10.5f);
		 
		 Integer i =  (Integer) al.get(0);
		 //System.out.println( "Array List Index O Value is :" +i);
		 
		 // Unboxing 
		 int a= i.intValue();
		 System.out.println("Unvboxing ArrayList Index is :" +a );
		 
		 
		 String s =  (String) al.get(1);
		 System.out.println("Array List Index 1 Value is :" +s);
		 
		 Float f = (Float) al.get(2);
		 System.out.println( "Array List Index 2 Value is :"+f);
		 

	}

}
