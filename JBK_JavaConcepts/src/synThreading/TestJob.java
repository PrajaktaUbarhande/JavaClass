package synThreading;

public class TestJob {
	
	
	public static void main(String[] args) {
		 
		Job job = new Job ();
		
		Thread thread1 = new Thread(job , "Thread1");
		Thread thread2 = new Thread(job , "Thread2");
		
		thread1.start();
		thread2.start();
		
		
		
		
		
		
	}

}
