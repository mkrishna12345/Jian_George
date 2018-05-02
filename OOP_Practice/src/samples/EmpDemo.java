package samples;

import oopfundamentals.Employee;

public class EmpDemo {
	
	
	
	
	
	
	

	public static void main(String[] args) {


		
		
Employee e=new Employee(100);
e.getEmployeeDetails();

Employee.wishMe();
String cm=Employee.company;
System.out.println(cm);

		

	}

	
	static 
	{
		System.out.println("With in the Static Block");
	}
}
