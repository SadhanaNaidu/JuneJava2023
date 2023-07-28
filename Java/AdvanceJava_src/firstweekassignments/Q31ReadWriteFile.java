package firstweekassignments;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Q31ReadWriteFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		//String path = "C:\\Users\\User\\eclipse-workspace\\JavaBasic\\FirstReadFile.txt";
		//FileReader fr = new FileReader(path);
		//BufferedReader bf = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList();
		//System.out.println(bf.readLine());
		String Str  ;
		
				 
		 //////writing to file
		
		
		String udir = System.getProperty("user.dir");// path till Advance Java
		String fileSeparator = System.getProperty("file.separator");
		
		
		String readpath = udir+fileSeparator+"Textfiles"+fileSeparator+"ReadFile.txt";
		FileReader fr = new FileReader(readpath);
		BufferedReader bf = new BufferedReader(fr);
		
		String copypath =  udir+fileSeparator+"Textfiles"+fileSeparator+"CopyReadFile.txt"; //file to be created manually
		
		 //FileWriter FW = new FileWriter("C:\\Users\\User\\eclipse-workspace\\JavaBasic\\FirstCopyFile.txt");//creates file and copies
		FileWriter FW = new FileWriter(copypath);
		BufferedWriter BW = new BufferedWriter(FW);
		
		String count;
	    while ((count = bf.readLine()) != null) //reds line into count
	    {
	        al.add(count); //add read line to arraylist
	    }
	      
	    Collections.reverse(al);
	      
	    for (Iterator i = al.iterator(); i.hasNext();) 
	    {
	    	BW.write((String) i.next());
	    	BW.write(String.format("%n"));
	    }
		 
			/*
			 * for ( Str = bf.readLine(); Str != null; Str = bf.readLine()) ///readline to
			 * str again and check !=null { BW.write((Str)); BW.write(String.format("%n"));
			 * }
			 */
		
	    bf.close();
	    BW.close();	 
		
	}
		
}
