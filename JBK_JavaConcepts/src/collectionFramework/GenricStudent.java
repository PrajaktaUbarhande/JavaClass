package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class GenricStudent {
	
	int rollNo , marks;
	
	GenricStudent( int r , int m)  {
		 
		rollNo = r;
		marks  = m;
		  
		}// end Constructor
		
	public String toString() {
		return rollNo + " " + marks;
		
	}
	
	
	
public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter how many Students you want to add : ");
//		int size = sc.nextInt();
//		GenricStudent[]  students=new GenricStudent[3];
//		
//		ArrayList<GenricStudent> std = new ArrayList<GenricStudent>(size);
//		
//		for (int i = 0; i < size; i++) 
//		{
//			System.out.println("Enter RollNumber :");
//			int eno = sc.nextInt();
//			
//			System.out.println("Enter Marks :");
//			int esalary = sc.nextInt();
//			
//			students[i]=new GenricStudent(eno,esalary);
//			std.add(new GenricStudent(eno,esalary));
//			
//	    }
//		
//		
//		int max = std.get(0).marks;
//		
//		int maxidex = 0;
//		
//		for (int j = 1;j<std.size();j++) {
//			
//			
//			if (std.get(j).marks> max) {
//				
//				max = std.get(j).marks;
//				
//				maxidex=j ;
//				
//				
//			}
//			
//		}// for loop
//		
//		
//		System.out.println(max);
//		System.out.println(maxidex);
//		
		
		  //declare min and max value as the first element of the list
//        int min = std.get(0);
//        int max = std.get(0);
//        
//        //declare min and max elements index as 0 (i.e. first element)
//        int minIndex = 0, maxIndex = 0;
//        
//        //Iterate through ArrayList
//        for(int i = 1; i < std.size(); i++ ){
//    
//             /*
//              * If current value is less than min value, it 
//              * is new minimum value
//              */
//            
//            if( std.get(i) < min ){
//                min = std.get(i);
//                minIndex = i;
//            }
//            System.out.println(minIndex);
	
	
	
	
	ArrayList al = new ArrayList();
	 al.add(10);
     al.add(10);
     al.add(3);
     
     System.out.println(al);
	
	
	HashSet hs = new HashSet();
	
	hs.add(10);
	hs.add(10);
	hs.add(3);
	System.out.println(hs);
	

	
		
        }
		
	
	}


