package day4;

import java.io.*;


public class ReadWriteFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\User\\eclipse-workspace\\JavaBasic\\FirstReadFile.txt";
		FileReader fr = new FileReader(path);

		
		BufferedReader bf = new BufferedReader(fr);
		System.out.println(bf.readLine());
		String Str ;
		
		//iterators for printing file contents
		/*for ( Str = bf.readLine(); Str != null; Str = bf.readLine())    ///readline to str again and check !=null
		{
		       System.out.println(Str);
		}*/
		
		
		/* while((Str = bf.readLine()) != null) // check for !=null
		 {
		  
		  System.out.println(Str); 
		 }*/
		
		 		 
		 for(; (Str = bf.readLine()) != null;) //no increment in for loop
		 { 
			 System.out.println(Str);
		  }
		 
		 //////writing to file
		 FileWriter FW = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JavaBasic\\FirstWriteFile.txt");// creates the file and writes
		 BufferedWriter BW = new BufferedWriter(FW);
		 BW.write("Hello");
				
		
		
		 bf.close();
		BW.close();
		
}
		
	}


