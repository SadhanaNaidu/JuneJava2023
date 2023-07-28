package firstweekassignments;

import java.util.*;


public class Q1CheckBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Input value 1 as True/False:");
		boolean a = S.nextBoolean();
		System.out.println("Input value 2 as True/False:");
		boolean b = S.nextBoolean();
		System.out.println("Input value 3 as True/False:");
		boolean c = S.nextBoolean();
		//boolean Final;
		
		if (a == true)
		{
			if ((b || c) == true)
				System.out.println("Two of the given inputs are True");
		
			else
				System.out.println("Two of the given inputs are false");	
		}
		
		else
		{
			if ((b && c) == true)		
				System.out.println("Two of the given inputa are true");
			
			else
				System.out.println("Two of the given inputs are false");
		}
		S.close();	

	}
	

}
