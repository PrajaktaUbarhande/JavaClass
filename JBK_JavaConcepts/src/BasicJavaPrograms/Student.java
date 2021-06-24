
package BasicJavaPrograms;

class Student {

	int rollNo, marks;

	Student(int r, int m) { // Constructor start
		// constuctor name always same as class name and not use data type before Constructor name

		
	// create an object
// role intizalize the varible 		
		rollNo = r;
		marks = m;

	}// Constructor end

	
	  void display() {// method Start
	 
	  System.out.println("Student RollNo = " + rollNo);
	  System.out.println("Student Marks = " + marks);
	  
	  }
	 // Method end

}// student class end

class Test { // create 2nd class

	public static void main(String[] args) {

		Student rahul = new Student(1, 90); // creating object for rahul
		Student dipak = new Student(2, 80); // creating object for dipak

	    rahul.display();        // method calling 
		dipak.display();
 
       
		/*
		 * System.out.println("Student RollNo = " + rahul.rollNo);
		 * System.out.println("Student Marks = " + rahul.marks);
		 * System.out.println("Student RollNo = " + dipak.rollNo);
		 * System.out.println("Student Marks = " + dipak.marks);
		 * 
		 */
	}

} // Test class end



