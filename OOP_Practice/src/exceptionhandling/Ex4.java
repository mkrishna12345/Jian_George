package exceptionhandling;

import java.io.File;
import java.io.IOException;

import com.sun.swing.internal.plaf.basic.resources.basic;

import inheritance.Bank;

public class Ex4 {

	public static void main(String[] args) throws IOException  {


		/*System.out.println(10/0); // Unchecked Exception
		// creare new File
		File f=new File("D://abc.txt");
		f.createNewFile();*/
		Bank b=new Bank();
		b.withdraw(1234, 140000.00);
	}

}
