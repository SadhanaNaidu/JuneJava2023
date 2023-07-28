package firstweekassignments;

import java.util.Scanner;

public class Q14ReverseWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		StringBuilder New = new StringBuilder();
		New.append(Str);
		
		//String S1 = New.substring(0, 4); //breaks the string from 0 to(4-1) 
		//System.out.println(S1);
		String[] str1 = Str.split(" ");
		String first = str1[0]; //assigns  value after split i.e, word in 0 position
		String second = str1[1]; // assigns value from1 position
		/*for(String St: str1)
		{
			
			System.out.println(St);
		} */
		
		System.out.println(second+" "+first);
		
		S.close();
	}

}
