package programsPractices;

import java.util.Scanner;

import BasicJavaPrograms.ToStringMethod;

public class Student {
	
	int rollNo , marks ;
	
    Student ( int r , int m){
    	
    	rollNo = r;
    	
    	marks = m ;
    	
    } // cons end 
    
    public  String ToStringMethod() {
		return  rollNo + " " + marks ;	
    
    } // to string end
    
    
     
    
public static void main(String[] args) {
	
	//int[] Student = null;
	
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Number of Student :");
     int size =sc.nextInt();
 
     Student[] students = new Student[size];
    // Student min1 = new Student(" ", " ");
     
     
     for ( int i = 0 ;i <size;i++) 
     {
     
      System.out.println( "Enter Student Roll No:");
      int sRollNo = sc.nextInt();
     
     System.out.println( "Enter Student Marks:");
	 int sMarks = sc.nextInt();
	 
	 students[i] = new Student(sRollNo, sMarks) ;	
	 
 
	}
     int min = students[0].marks ;
      
    for ( int j =1 ; j<students.length;j++) {
    	  
  
    	  if (students[j].marks < min ) {
    		  
    		 min = students[j].marks;
    		 
    		  
    	   
      }  System.out.println("Minimum Marks of Student is :" + min);   
    	     		 
}
}}
