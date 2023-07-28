package secondweekassignments;

import java.util.Scanner;

public class Q3ReplaceSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String Str1 = S.nextLine();
		System.out.println("Enter the word to be replaced: ");
		String Str2 = S.next();
		System.out.println("Enter the replacing word: ");
		String Str3 = S.next();
		System.out.println("New sentence:  "+Str1.replace(Str2,Str3));
		//System.out.println("New sentence:  "+Str1);
		S.close();
	}

}
