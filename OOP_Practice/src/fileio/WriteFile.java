package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFile {

	public static void main(String[] args) throws IOException {


		
		
		/*
		 * Writing to  Files
		 * 
		 * OutPutStream
		 * (Charecter Stream)
		 * 
		 * 
		 * Writer- AB Class
		 * 
		 * FileWriter 
		 * 
		 * 
		 */
		// Create The File Object
		
		File writeFile=new File("E:\\jain_io\\abc.txt");
		
		//FileWriter writer=new FileWriter(writeFile);
		
		FileWriter writer=new FileWriter(writeFile, true);
		
		
		char[] charArray={'O','O','P','S'};
		
		
		String message="Java is Platform Independent Programing Language";
		
		if(writeFile.exists()==false)
		{
			System.out.println("File is Not There");
		}
		else
		{
			
			//writer.write(" Is Object Oriented Programing");
 
             //writer.write(charArray);
			//writer.write(112);
			
			writer.write(message, 8, 20);
			
			writer.flush();
			
		}
		
		System.out.println("Write Completed");
		
		
	}

}
