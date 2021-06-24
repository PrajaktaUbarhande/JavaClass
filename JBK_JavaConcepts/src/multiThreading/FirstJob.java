package multiThreading;

public class FirstJob implements Runnable {

	
	public void run() {
		
		for(int i = 1 ;i< 3 ;i++) {
			
			System.out.println("Java " +  Thread.currentThread().getName());
		}
		
		
		
		
		
	}



}
