package oopfundamentals;

public  class Employee {
	
	
	
	
	
	
	
	// instance 
	private int eid;
	private String ename;
	
	private String mobile;
	private String email;
	private double salary;
	private String designation;
	// class variable
	public  static String company="Wipro";
	
	/*
	 *  static varibles
	 *  static methods
	 *  
	 *  static block
	 *  
	 *  
	 *  static classes(inner classes)
	 */
	
	
	
	/*public 
	 * private 
	 * protected
	 * 
	 * NoModifier
	 * 
	 */
	/*
	 * Default Const
	 * Employee();
	 * Zero Argument Constr
	 * 
	 * Parameterized Constructor
	 * 
	 * 
	 */
	
	public Employee()
	{
		eid=10;
		ename="krishna";
		mobile="8500493754";
		email="maddelakrishnakumar@gmail.com";
		salary=30000.00;
		designation="Trainer";
		
	}
	
	
	public Employee(int id)  // Local variables
	{
		eid=id;
	}
	Employee(int id,String name)
	{
		this(id); // call to contructor
		ename=name;
	}
	
	
	public  Employee(int eid,String ename,String mobile,String email,double salary,String designation)
	{
		
		
		this(eid,ename);
		this.mobile=mobile;
		this.email=email;
		this.salary=salary;
		this.designation=designation;
	//company=com;
		
	}
	
	
	// instance 
	public void getEmployeeDetails()
	{
	
	System.out.println(eid+" "+ename+""+mobile+""+email+""+salary+""+designation+" "+company);
	}
	
	
	public static void wishMe()
	{
		System.out.println("Good Morning");
	}
}
