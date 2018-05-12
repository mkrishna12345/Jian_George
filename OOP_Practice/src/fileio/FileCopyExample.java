package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopyExample {

	public static void main(String[] args) throws IOException {


		//
		File readFile=new File("D:\\Jain_Java\\ReadingInput.java");
		
		File writeFile=new File("E:\\jain_io\\Sample.java");
		
		
		//Redaer
		
		Reader reader=new FileReader(readFile);
		
		// Writer
		
		Writer writer=new FileWriter(writeFile,true);
		
		int i=reader.read();
		
		while(i!=-1)
		{
			writer.write(i);
			writer.flush();
			i=reader.read();
		}
		
		System.out.println("Copied SuccessFully");
		
	}

}
