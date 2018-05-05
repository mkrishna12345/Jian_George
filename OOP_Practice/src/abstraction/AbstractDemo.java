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
	}

}
