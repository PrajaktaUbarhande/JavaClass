package multiThreading;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
//		FirstJob firstJob = new FirstJob();
//		SecondJob secondJob = new SecondJob();
		
		
		Thread thread1 = new Thread(new FirstJob(),"By");
		
		Thread thread2 = new Thread(new SecondJob(),"Kiran");
		
		  //new Thread(new firstJob)
		
		thread1.start();
		
		//Thread.sleep(1000);
		
		thread2.start();
	
		
//	 Thread.currentThread().getName();
//	   
		
	}

}
