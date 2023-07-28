package AssignmentQuestions;
import java.util.*;

class Sumof 
{
	static int Maximum(int a, int b)
	{
		if (a>b)
		{
			return a;
		}
		return b;
	}
	
	static int Maximum(int a, int b, int c)
	{
		if (c>=b) //& c<=a); Using NestedIf
		{
			if (c>=a)
			{
				return c;
			}
			else
			{
				return a;
			}
		}
		else
		{
			if (b>=a)
			{
				return b;
			}
			else
			{
				return a;
			}
				
		}
		
		
	}
}


public class MaxOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Value1 = ");
		int num1 = S.nextInt();
		System.out.println("Value2 = ");
		int num2 = S.nextInt();
		System.out.println("Value3 = ");
		int num3 = S.nextInt();
		System.out.println("Max of Value1 and Value2 is: "+Sumof.Maximum(num1,num2));
		System.out.println("Max of Value1, Value2 and Value3 is: "+Sumof.Maximum(num1,num2,num3));
		
		S.close();
		

	}

}
