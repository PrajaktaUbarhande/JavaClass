package collectionFramework;
/*
     
   Comparable interface is present in java.lang Package . It is used to provide single sorting sequence .
   
   Comparator interface is present in java.util package . It provides multiple sorting sequences .
   
   In comparable interface we write compareTo() in class whose object we want to sort .
   
   But Sometimes we do not have access to some classes and hence we can not write compareTo() in that class.
   
   e.g. We can write our own compareTo() in java.util.Date class . In such case we should Comparator interface
   
    which does not change/access original class
    
    
    Comparable interface is used to sort object in natural sorting order . e.g. 
    
    String are sorted in ascedning order of alphabates like a,b,cd
    
    Integer are sorted in ascedning order  like 1,2,3,
    
    If we need customized sorting then we should use Comparator interface .
    e.g. To sort String or Integer  objects in descending order we need comparator interface
    
 */

/* -3 -2 -1  0  1 2 3  */

import java.util.Comparator;
import java.util.TreeSet;

class Emp 
{

	int eno,sal;
	
	Emp(int e,int s)
	{
		eno=e;
		sal=s;
	}

	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", sal=" + sal + "]";
	}
	
	
}

// sorting Emp class object based on eno

// Sort1 is implemention class of Comparator interface

class Sort1 implements Comparator<Emp>
{
	
	public int compare(Emp e1, Emp e2) {
		
		//12-3=9
		if(e1.eno > e2.eno)
			return 10;
		
		else if (e1.eno<e2.eno)
			return -90;
		
		
		else
		     return 0;
		
	}
	
}


//sorting Emp class object based on salary
//Sort2 is implemention class of Comparator interface

class Sort2 implements Comparator<Emp>
{
	
	public int compare(Emp e1, Emp e2) {
		//-3 -2 -1 0 1 2 3
		//12-3=9
		if(e1.sal > e2.sal)
			return 10;
		
		else if (e1.sal<e2.sal)
			return -90;
		
		
		else
		     return 0;
		
	}
	
}

 class ComparatorDemo {
	
	public static void main(String[] args) {
		
		Emp e1=new Emp(2,5000);
		Emp e2=new Emp(1,6000);
		
		
		// sort1 class sorts emp object based on eno
		TreeSet<Emp> t;
		
		t=new TreeSet<Emp>(new Sort1());
	
		
		t.add(e1);
		t.add(e2);
		System.out.println("Sorting objects based on eno");		
		System.out.println(t);
		
		
		// sort2 class sorts emp object based on salaries
		
      	t=new TreeSet<Emp>(new Sort2());
		t.add(e1);
		t.add(e2);
		
		System.out.println("Sorting objects based on salary");		
		System.out.println(t);
		
		
	}

}
