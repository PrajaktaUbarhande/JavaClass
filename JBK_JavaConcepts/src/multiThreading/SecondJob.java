package multiThreading;

public class SecondJob  implements Runnable{

	
	public void run() {
	
		for(int i = 1; i<3 ;i++) {
			
			System.out.println("Easy " +  Thread.currentThread().getName());
		}
		
		
		
		
		
	}

	
}
