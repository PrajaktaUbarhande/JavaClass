package Bank;

public class BankAccount {

	int customerAccNo;
	String customerAccType;
	String customerName;
	int customerBalance;
	static String customerCountry = "India";

	BankAccount(int accNo, String accType, int accBal, String name) {

		customerAccNo = accNo;
		customerAccType = accType;
	
		customerBalance = accBal;
		customerName = name;

	}// Constructor end

	void dispay() {

		System.out.println(" Customer Account deatils ");

	}

	
//	void show() {
//		System.out.println(" Customer Account deatils ");
//		System.out.println("");
//		
//	}
	void deposit(int depositAmt) {

		customerBalance = customerBalance + depositAmt;

	}
	
	void withdrow ( int withrowAmt) {
		
		customerBalance = customerBalance - withrowAmt ;
	}
	
	 void searchcCustomer (String custName){
		 
		 if (custName != null) {
		  System.out.println("Customer Name is : " + custName);
		 }
		 else {
			 System.out.println("Customer Not Found ");
		 }
	
	}
	 
}// class end

class accountChecking {
	public static void main(String[] args) {
		
		
		BankAccount accDetails = new BankAccount(001, "Saving", 2000, "Prajakta");

		 //BankAccount.accDetails.getAccountOpening(001, "Saving", 2000, "Prajakta");
		
		 //System.out.println("Intial Details : " + accDetails.customerBalance);
		 accDetails.dispay();
		
		
	}

}
