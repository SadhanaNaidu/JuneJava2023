package firstweekassignments;

import java.util.Scanner;

public class Q21StringIntConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		//char [] C = new char[30];
		int I = Integer.parseInt(Str);//parseInt(string s) is static method under Integerclass which converts S to I
		System.out.println(I+10);
		S.close();
		

	}

}
