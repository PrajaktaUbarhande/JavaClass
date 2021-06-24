package collectionFramework;

import java.util.TreeSet;

public class Students implements Comparable<Students> {
int rno,marks;
	
	Students(int r,int m)
	{
		rno=r;
		marks=m;
	}

// 12-5=7
// 5-12=-7
// 12-12=0
//  -3 -2 -1  0  1   2   3
	public int compareTo(Students s) {
			
		if(this.rno==s.rno)
			
			return 0;
		
		else if(this.rno<s.rno)
			
			return -1;
		
		else
			
			return 1;
		
	}


	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	
	
}


class ComparableDemo {

public static void main(String[] args) {
	
	Students s1=new Students(1,90);
	Students s2=new Students(2,40);
	Students s3=new Students(3,40);
	
	
	TreeSet<Students> t=new TreeSet<Students>();
	
	t.add(s1);
	t.add(s2);// s2.compareTo(s1)
	t.add(s3);
	
	System.out.println(t);
	
	
	
}
	

}
