package abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
   // Bank b=new Bank();
    
    /*
     * Abstarct clases can not intstantiated
     */

		
		
		Bank b;
		b=new ICICIBank();
		b.withdraw(123, 20000.00);
		
		/*
		 * All the un implemented methods of abstract class should be implemented in
		 * thier sub classes
		 */
		
		
		Bank b1=new ICICIBank();
		b1.deposit(1234, 50000);
	}

}
