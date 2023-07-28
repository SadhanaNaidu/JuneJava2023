package firstweekassignments;

import java.util.Scanner;

public class Q28RecursiveFactorial {
	
	
	static int Factorial(int x)
	{
		//int fact = 1;
		if (x>0)
		{
			int fact = x * Factorial(x-1);		
			return fact;
		}else return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number to find Factorial:");
		int num = S.nextInt();
		//int fact = 1;
		System.out.println("Factorial of "+num+" is:"+Factorial(num));
		S.close();	
	}

}
