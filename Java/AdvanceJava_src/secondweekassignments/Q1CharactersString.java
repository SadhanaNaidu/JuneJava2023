package secondweekassignments;

import java.util.*;

public class Q1CharactersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = S.nextLine();
		System.out.println("Enter the character: ");
		char C = S.next().charAt(0);
		//char[] Carray = str.toCharArray();
		
		String Output = str.substring(str.indexOf(C)+1, str.lastIndexOf(C));//gives substring between the from+1 till to index
		
		Output = Output.replaceAll(" ", "");//replaces space with no space(removes space)
			
		//for(String St : Str)
		System.out.println("No.of characters found inbetween "+C+" is: "+Output.length());
		S.close();	
	
	
	}

	
	
}


