package inheritance;

public class RegularEmployee extends Employee{
	
	private double salary;
	private double bonus;
	public RegularEmployee(int eid, String ename, double salary, double bonus,Address address) {
		
		super(eid, ename, address);
		  //super constructor
		
		
		this.salary = salary;
		this.bonus = bonus;
		
	}
	@Override
	public void getEmpDetails() {


		super.getEmpDetails();
		System.out.println(salary+" "+bonus);
		
		
		
	}
	

	
	
	
}
