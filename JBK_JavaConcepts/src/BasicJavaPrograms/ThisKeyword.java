package BasicJavaPrograms;

public class ThisKeyword {
	int Pid ;
	ThisKeyword (int Pid){
		this.Pid = Pid ;
	}
	
public static void main(String[] args) {
	 
	ThisKeyword obj = new ThisKeyword(10);
	System.out.println(obj.Pid);
	
	
}
}
