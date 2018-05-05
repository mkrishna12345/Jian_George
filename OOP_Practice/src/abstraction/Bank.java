package abstraction;

public abstract class Bank {

	 int accountNumber=1234;
 double balance=50000.00;
	// withdraw
	// abstract method
	public abstract void withdraw(int accountNumber,double amount);
	
	
	public abstract void getROI();
	// deposit
	
	// concrete method
	public void deposit(int accountNumber,double amount)
	{
		if(this.accountNumber==accountNumber)
		{
			
				balance=balance+amount;
				System.out.println("Depost  Success");
				System.out.println("  New  Balance is :"+balance);
			
			
		}
		else
		{
			System.out.println("Invalid Accont Number");
		}
	}
	

	
	
}
