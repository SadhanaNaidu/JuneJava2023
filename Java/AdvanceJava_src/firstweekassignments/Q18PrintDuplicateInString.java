package firstweekassignments;

import java.util.*;
//import java.io.*;

public class Q18PrintDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		//char [] C = new char[30];
		char[] C = Str.toCharArray();
		int count;
		
		System.out.println("Duplicate characters found:");
		for (int i=0; i<Str.length(); i++)
		{
			count = 1;
			for (int j=i+1; j<Str.length(); j++)
			{
				if(C[i] == C[j]) //arryindexoutofboundexception if j<=Str.length() (solved)//
				{
					//System.out.println(C[i]);
					count +=1;
					C[j]=' ';
				
				}
			}
			if(count > 1  && C[i] != ' ')  
			{
	            System.out.println(C[i]+" is repeated"); 
			}
			
		}
		
		
		S.close(); 

	}

}
