package oopfundamentals;

public class MethodOverloadingDemo {

	public static void main(String[] args) {


		
		
		Addition a=new Addition();
		int res=a.add(20, 50); // call to method
		System.out.println(res);
		
		double res1=a.add(40.0, 7.0); // method call
		System.out.println(res1);
		
		a.add(78, 12); // method call
		/*
		 * BINDING IS CONNECTING A METHOD CALL TO THE METHOD DEFINITION
		 * COMPILE TIME BINDING/ EARLY BINDING/ STATIC BINDING
		 */
		
	
	}

}
