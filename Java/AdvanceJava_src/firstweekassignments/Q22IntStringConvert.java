package firstweekassignments;

import java.util.Scanner;

public class Q22IntStringConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Integer value:");
		int i = S.nextInt();
		String s = String.valueOf(i);// valueOf is method under String class to convert
		System.out.println(s+i);
		S.close();

	}

}
