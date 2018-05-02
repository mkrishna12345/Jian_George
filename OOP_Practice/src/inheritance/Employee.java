package inheritance;

public class Employee {
	
	private int eid;
	private String ename;
	
	
	public Employee(int eid, String ename) {
	   this.eid=eid;
		this.ename = ename;
	}
	
	
	public void getEmpDetails()
	{
		System.out.println(eid+"   "+ename);
	}

}
