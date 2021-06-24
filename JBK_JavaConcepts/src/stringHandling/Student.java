package stringHandling;

import java.util.Scanner;

public class Student {
	
	
	
int rollNo , marks ;
	
    public Student ( int r , int m){
    	
    	rollNo = r;
    	
    	marks = m ;
    	
    } // cons end 
    
    public  String ToStringMethod() {
		return  rollNo + " " + marks ;	
    
    } // to string end
    
    
    
    
public static void main(String[] args) {

	
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Number of Student :");
     int size =sc.nextInt();
 
     Student[] students = new Student[size];
     
     
     for ( int i = 0 ;i <size;i++) 
     {
     
      System.out.println( "Enter Student Roll No:");
      int sRollNo = sc.nextInt();
     
     System.out.println( "Enter Student Marks:");
	 int sMarks = sc.nextInt();
	 
	 students[i] = new Student(sRollNo, sMarks) ;	
	}
     
      int  min1 = students[0].marks;
      
      for ( int j =1; j<students.length;j++) {
    	  
  
    	  if (students[j].marks < min1 ) {
    		  
    		 min1 = students[j].marks;
    		 
    		 System.out.println(" Mininum Marks of Student " + min1);     
    	  
    	  
      }
     
      
     
     
      }  
	
	
}
}
