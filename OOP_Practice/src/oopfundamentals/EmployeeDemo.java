package oopfundamentals;

public class EmployeeDemo {

	public static void main(String[] args) {

// Object
		
		// declare object
		
		int a; // 4 bytes
		
		
		Employee e;  // 
		
		// create objets
		e=new Employee(1,"krishna","8500493","krishna@gmail.com",30000.00,"Trainer"); // call to constructor
		
		e.getEmployeeDetails();
	
		
		
		Employee e1;
		e1=new Employee(2);
		
		e1.getEmployeeDetails();
		
		Employee e2=new Employee(3,"George");
		e2.getEmployeeDetails();
	}

}
