package firstweekassignments;

import java.util.*;

public class Q13PrintReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		StringBuilder New = new StringBuilder();//StringBuilder object is created since string is immutable
		New.append(Str); //append is used to store given string in New
		//System.out.println("String after append is: "+New);
		New.reverse(); // reverse is ised to reverse and store the string in New
		System.out.println("Reverse String is: "+New);
		//System.out.println("Given String after reverse in old object: "+Str);
		S.close();
	}

}
