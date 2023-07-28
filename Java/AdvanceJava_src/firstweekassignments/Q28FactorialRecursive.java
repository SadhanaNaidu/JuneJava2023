package firstweekassignments;

import java.util.Scanner;

public class Q28FactorialRecursive {
	
	 public static long factorial(int X)
	    {
	        if (X >= 1)
	            return X * factorial(X - 1);
	        else
	            return 1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number:");
		int L = S.nextInt();
		System.out.println("Factorial of the given number "+L+" is: "+factorial(L));
		S.close();
	}

}
