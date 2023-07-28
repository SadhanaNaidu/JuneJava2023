package firstweekassignments;//////Incomplete
//checking input for boolean, integers,string

import java.util.Scanner;

public class Q23DifferentiateInput {
	
	/*public static void checkboolean(String S)
	{
		if(S.equalsIgnoreCase("true")  || S.equalsIgnoreCase("false") )
		{
			System.out.println("Entered  string is Boolean type");
		}
	}*/
	
	public static void checkstring(String S)
	{
		char C [] = S.toCharArray();
		
		int i=0;
		if(S.equalsIgnoreCase("true")  || S.equalsIgnoreCase("false") )
		{
			System.out.println("Entered  string is Boolean type");
		}
			
		else if((C[i] >= 'A' && C[i] <= 'Z') || ( C[i] >= 'a' && C[i] <= 'z' ))
		{
			System.out.println("Input is String type");
		}
		else if (C[i] >= '0' && C[i] <= '9')
		System.out.println("Input is Integer type");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter any string:");
		String Str = S.nextLine();
		//char C [] = Str.toCharArray();
		//checkboolean(Str);
		checkstring(Str);
		
		S.close(); //
	}

}







/*
 * System.out.println("Enter any string:");
 * 
 * if(S.hasNextInt()) { System.out.println("Integer"); }
 * 
 * else if (S.hasNextBoolean()) { System.out.println("Boolean"); } else { String
 * Sc = S.nextLine(); if(Sc.length()>1) { System.out.println("String"); }
 * 
 * }
 *///////works
