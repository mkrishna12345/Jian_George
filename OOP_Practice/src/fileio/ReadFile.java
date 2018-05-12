package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) throws IOException {


		
		/*
		 * Reader
		 * 
		 * 
		 */

		
		File f=new File("E:\\jain_io\\abc.txt");
		
		//Reader
		
		Reader reader=new FileReader(f);
		
		
		/*
		int i=reader.read();
		while(i!=-1)
		{
		System.out.print((char)i);
		i=reader.read();
		}*/
		
		
		char readArray[]=new char[45];
		
		/*
		int i=reader.read(readArray);
		System.out.println(i);
		
		for(char c:readArray)
		{
			System.out.print(c);
		}
		*/
		
		
		reader.read(readArray, 0, 45);
		
		for(char c:readArray)
		{
			System.out.print(c);
		}
		System.out.println();
		System.out.println("Read Completed");
		
		
		
	}

}
