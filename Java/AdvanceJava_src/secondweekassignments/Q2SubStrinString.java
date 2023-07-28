package secondweekassignments;

import java.util.Scanner;

public class Q2SubStrinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String Str1 = S.nextLine();
		System.out.println("Enter the character sequence to find in sentence: ");
		String Str2 = S.next();
		System.out.println("True/False: "+Str1.contains(Str2));
		S.close();
	}

}
