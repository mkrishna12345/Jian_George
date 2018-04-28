package oopfundamentals;

public class Product {
	
	//instance variables
	private int pid;
	private String pname;
	private String product_description; 
	private double price;
	private int quantity;
	
	
	//contructor
	
	public Product(int pid, String pname, String product_description, double price, int quantity) {
		
		this.pid = pid;
		this.pname = pname;
		this.product_description = product_description;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	// methods
	
	public void getProductDetails()
	{
		System.out.println(pid+" "+pname+" "+product_description+"  "+price+"  "+quantity);
	}
	

	
	
	public static void main(String[] args) {
		
		
		Product prd=new Product(123, "TV", "HD Smart", 70000.00, 2);
		
		prd.getProductDetails();
		
	}
}
