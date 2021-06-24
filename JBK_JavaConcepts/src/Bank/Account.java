package Bank;

public class Account {

	int accNo , bal;
	
	Account( int a ,int b){
		
		accNo = a ;
	    bal   = b;
	
	}// Constructor end 
	
	
	// account methods
	void deposit(int d) 
	{
		
		bal = bal + d;
	}
	
	int withdrow(int w)
	{
		 return bal = bal-w;
		 
	}
	
}// class end

class CheckAccount{ // class second start

	public static void main(String[] args) 
	{
		
	Account acc = new Account (1 ,1000);
	
	System.out.println("Intiall Balance : " + acc.bal);
	
	acc.deposit(1000);
	
	System.out.println("Balance after deposit : " +acc.bal);
	
	int upadtedBalance = acc.withdrow(200);
	
	System.out.println("My UpadtedBalance  : " + upadtedBalance);
	
		
	}
	
} 

