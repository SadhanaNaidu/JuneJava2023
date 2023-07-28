package secondweekassignments;

import java.util.Scanner;

public class Q4ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		StringBuilder New = new StringBuilder();//StringBuilder object is created since string is immutable
		New.append(Str); //append is used to store given string in New
		New.reverse(); // reverse is ised to reverse and store the string in New
		System.out.println("Reverse String is: "+New);
		S.close();

	}

}
