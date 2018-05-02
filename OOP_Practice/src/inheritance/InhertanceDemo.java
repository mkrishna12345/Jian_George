package inheritance;

public class InhertanceDemo {
	
	public static void main(String[] args) {
		
		
		Bank b=new Bank();  // super class Object
		b.withdraw(1234, 40000.00); // method call will be connected at run time
	
		int roi=b.getROI();
		System.out.println(roi);
		HDFCBank hdfc=new HDFCBank();  // sub class
		hdfc.withdraw(1234, 20000.00);
		int roi1=hdfc.getROI();
		System.out.println(roi1);
		
	}

}
