package exceptionhandling;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter First Value");
		a=s.nextInt();
		System.out.println("Enter Second Value");
		b=s.nextInt();
		try
		{
		
		
		c=a/b; // exception
		
		
		
		System.out.println(c);
		}catch(ArithmeticException e)
		{
		System.out.println("Devide By Zero Error ");
		}
		
		/*
		 * try
		 * catch
		 * finally
		 * 
		 * throw 
		 * throws
		 */
		
		
	}

}
