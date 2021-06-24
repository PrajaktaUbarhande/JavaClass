package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileStream = new FileOutputStream("WriteFile.txt");
		
		String msg = "Java is easy To Understand" ;
		
		fileStream.write(msg.getBytes());		
		
		

	}

}
