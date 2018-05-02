package inheritance;

public class EmpDemo {

	public static void main(String[] args) {


		
		
		Employee e=new Employee(123, "krishna");
		e.getEmpDetails();
		
		RegularEmployee re=new RegularEmployee(123,"krishna", 50000.00, 4000.00);
		re.getEmpDetails();
		
	}

}
