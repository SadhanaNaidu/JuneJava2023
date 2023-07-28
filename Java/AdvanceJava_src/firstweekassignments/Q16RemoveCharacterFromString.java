package firstweekassignments;

import java.util.*;

public class Q16RemoveCharacterFromString {
	
	//public void RemoveChar(String S, char C)//replace() method doesnt take character to string if declared as char
	public static void RemoveChar(String S, String C)
	{
		String[] Str1 = S.split(C);
		String first = Str1[0];
		String second = Str1[1];
		//first.concat(second);
		System.out.println("New sentence after dropping character: ");
		System.out.println(first.concat(second));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String Str = S.nextLine();
		//char arr[] = Str.toCharArray();
		System.out.println("Enter a Character to remove:");
		//char C = S.next().charAt(0);
		String C = S.next();
		RemoveChar(Str,C);
		
		
		
		
		S.close();
	}

}
