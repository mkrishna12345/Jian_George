package abstraction;

public class ICICIBank extends Bank {

	@Override
	public void withdraw(int accountNumber, double amount) {

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

	@Override
	public void getROI() {
		// TODO Auto-generated method stub
		
	}

	

}
