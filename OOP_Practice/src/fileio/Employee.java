package fileio;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int eid;
	private String ename;
	private double salary;
	private transient String password;
	
	
	
	public Employee(int eid, String ename, double salary,String password) {
		
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.password=password;
	}
	
	
	
	
	public String toString()
	{
		return eid+"  "+ename+"  "+salary+" "+password;
	}

}
