package inheritance;

public class Bank {
	
	private int accountNumber=1234;
	private double balance=50000.00;
	// withdraw
	
	public void withdraw(int accountNumber,double amount)
	{
		if(this.accountNumber==accountNumber)
		{
			if(amount<balance)
			{
				balance=balance-amount;
				System.out.println("WithDraw Success");
				System.out.println("  Remaining Balance is :"+balance);
			}
			else
			{
				System.out.println("InSufficint Balance");
			}
		}
		else
		{
			System.out.println("Invalid Accont Number");
		}
	}
	
	
	// deposit
	
	
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
	

	public int getROI()
	{
		return 10;
	}
	
	
}
