package stringHandling;

import java.util.Scanner;

import multiThreading.FirstJob;

public class MinLengthString {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter Number of String :");
	    int size =sc.nextInt();
		
	    String[] stringlen = new String[size];
	    
	    for ( int i = 0 ;i <size;i++) 
	     {
		
		System.out.println("Enter String :");
		String str =sc.next();	
		stringlen[i] = new String(str);
		//System.out.println( "Length of String is :" + str);
			
		}
	    
		int min=stringlen[0].length();
				String st=null;
				
		for(int i=1; i<stringlen.length; i++) {
			
			if(min > stringlen[i].length()) {
				min=stringlen[i].length();
				 st=stringlen[i];
			}
		}
	    System.out.println("String with minimum length is :"+st); 
		}
	    
}
