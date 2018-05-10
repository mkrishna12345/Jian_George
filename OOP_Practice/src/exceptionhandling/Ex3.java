package exceptionhandling;

import java.util.Scanner;

public class Ex3 {

	
	public static void main(String[] args) {

      Scanner s=new Scanner(System.in);
      System.out.println("Enter Any Two Values \n");
      int a=s.nextInt();
      int b=s.nextInt();

      
      try
      {
      int c=div(a,b);//
      
      System.out.println(c);
      
    
      }
      
      catch(ArithmeticException e)
      {
    	e.printStackTrace();  
      }
      
      finally{
			s.close();
		}
		

	}

	private static int div(int a,int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
