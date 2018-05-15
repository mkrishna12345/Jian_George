package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EmpDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		Employee emp=new Employee(101, "krishna kumar", 100000.00,"1234");
		
		
		// Serialization
		
		// write Objects
		OutputStream out=new  FileOutputStream(new File("E:\\jain_io\\employee.txt"));
		
		
		ObjectOutputStream oos=new ObjectOutputStream(out);
		
		oos.writeObject(emp);
		oos.flush();
		
		System.out.println("Employee Is Writen");
		
		
		
		
		
		InputStream in=new FileInputStream(new File("E:\\jain_io\\employee.txt"));
	
		
		
		ObjectInputStream  ois=new ObjectInputStream(in);
		
		Employee e=(Employee) ois.readObject();
		
		System.out.println(e);
		

	}

}
