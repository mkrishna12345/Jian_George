package inheritance;

public class Employee {
	
	private int eid;
	private String ename;
	
	private Address address; // dependent object   HAS_A
	
	public Employee(int eid, String ename,Address address) {
	   this.eid=eid;
		this.ename = ename;
		this.address=address;
	}
	
	
	public void getEmpDetails()
	{
		System.out.println(eid+"   "+ename+" "+address);
	}

}
