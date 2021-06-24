package synThreading;

public class Job  implements Runnable{

	 int i ;
	public void run() {
		
		System.out.println("Java is easy " + Thread.currentThread().getId());
		
		System.out.println ("******************************************");	
		synchronized (this) {
			for( i =1 ; i <= 3 ;i++) {
				
				
				
				System.out.println( i + " By " + Thread.currentThread().getName());
				
				
		      }
			System.out.println ("******************************************");	
		}
		
	}


}