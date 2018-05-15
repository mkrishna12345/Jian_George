package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyingImages {

	public static void main(String[] args) throws IOException {


		
		
		File f=new File("D:\\company\\Logo.jpg");
		
		// Read
		
		
		InputStream  is=new FileInputStream(f);
		
		// Write
		
		
		OutputStream  os=new FileOutputStream(new File("E:\\jain_io\\"+f.getName()));
		
		byte[] readImage=new byte[is.available()];
		
		is.read(readImage);
		
		
		os.write(readImage);
		os.flush();
		
		System.out.println("Image Copied Succesfully");
		
		
	}

}
