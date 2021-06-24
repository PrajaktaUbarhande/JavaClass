package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readFile {
 
	
	static FileInputStream fileInputStream;
	
	public static void main(String[] args) throws IOException {
		File file = new File("WriteFile.txt") ;
		System.out.println("File of Length is :" + file.length());
		//FileInputStream fileInputStream = null ;
		
		try {
	
		 fileInputStream = new FileInputStream("WriteFile.txt");
		for(int i =1 ;i<=file.length();i++) 
      	  
       	 System.out.print((char)fileInputStream.read());
		
		
		}catch(IOException e) {
			
		
			e.printStackTrace();
			
		}finally {
			fileInputStream.close();
		
		}
		
		//int assciiValue = fileInputStream.read();
		
		
        // int i =1;
//		 while((i = fileInputStream.read())!=-1) {
//		 System.out.print((char)i);	
//		 
//		 }
//		
	
		//*************Using For Loop ***************
        
	}

}
