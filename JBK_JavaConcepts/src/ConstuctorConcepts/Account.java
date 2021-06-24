package ConstuctorConcepts;

public class Account {

	int accountNo, accBalan ;
	String branch;
	
	Account(int n,int b,String br)
	{
		 accountNo = n;
		 accBalan = b;
		 branch = br;
		
		
	}
	
	void getDisplay() {
		
		System.out.println("AccountNumber : " +accountNo);
		System.out.println("Accontbalanc  : "+accBalan);
	}
}

class TestAccount {
	
	public static void main(String[] args) {
		Account rahul = new Account(1, 90000,"IT"); // creating object for rahul
		Account dipak = new Account(2, 80000,"Comp"); // creating object for dipak

	    rahul.getDisplay();        // method calling 
		dipak.getDisplay();

	}

}
