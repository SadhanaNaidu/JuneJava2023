package firstweekassignments;
import java.util.*;

public class Q2NonRecursiveFactorial {
	
	
	static int Factorial(int n)		
	{
		int fact = 1;
		int i = 1;
		do
		{			
			fact = fact * i;
			i++;
		} while(i<=n);
		 return fact;
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
