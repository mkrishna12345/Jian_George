package inheritance;

public class EmpDemo {

	public static void main(String[] args) {


		Address a=new Address("2-1", "H Nager", "Hyderabad", "India");
		
		Employee e=new Employee(123, "krishna",a);  //  Super class
		//e.getEmpDetails();
		
		//RegularEmployee re=new RegularEmployee(123,"krishna", 50000.00, 4000.00,a);  // sub class
		//re.getEmpDetails();
	
		
		
		
		Employee e1=new RegularEmployee(123,"krishna", 50000.00, 4000.00,a);
		e1.getEmpDetails();
		
		/*RegularEmployee re=(RegularEmployee) new Employee(123, "krishna",a);
		re.getEmpDetails();*/
		
	}

}
