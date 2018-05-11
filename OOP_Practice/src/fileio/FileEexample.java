package fileio;

import java.io.File;
import java.io.IOException;

public class FileEexample {

	public static void main(String[] args) throws IOException {


		/*File f;
		f=new File("E://jain_io//Sample.java");
		System.out.println(f.exists());
		
		f.createNewFile();*/
		
		
		
		/*File f=new File("E://jain_io//examples");
		f.mkdir();
		
		File f1=new File(f, "abc.txt");
		f1.createNewFile();
		
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.getParent());
		f1.renameTo(dest)*/
		
		File f=new File("E://jain_io");
		System.out.println(f.exists());
		
		
		String fileNames[]=f.list();
		
		for(String file:fileNames)
		{
			
			File f1=new File(f,file);
			if(f1.isDirectory())
			{
				
				System.out.println("The Files In the Directory :"+file+"\n");
				
				String [] innerFiles=f1.list();
				
				for(String inFile:innerFiles)
				{
					System.out.println(inFile);
				}
				System.out.println(" End of "+file);
			}
			else
			{
			
			System.out.println(file);
			}
		}
		
		
		
		
		
	}

}
