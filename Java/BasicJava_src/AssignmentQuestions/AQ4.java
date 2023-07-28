package AssignmentQuestions;
import java.util.*;




public class AQ4 {
	
	public static int Sum(int a, int b)
	{
		int S = (a+b);
		return S;
	}
	
	public static int Sub(int a, int b)
	{
		int Su = (a-b);
		return Su;
	}
	
	public static int Product(int a, int b)
	{
		int P = (a*b);
		return P;
	}
	
	public static float Div(int a, int b)
	{
		float D = (a/b);
		return D;
	}
	
	public static float Mod(int a, int b)
	{
		float M = (a%b);
		return M;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner X = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int x = X.nextInt();
		System.out.println("Enter the Second number: ");
		int y = X.nextInt();
		System.out.println("Sum of given two numbers: "+Sum(x,y));
		System.out.println("Difference of given two numbers: "+Sub(x,y));
		System.out.println("Product of given two numbers: "+Product(x,y));
		System.out.println("Division of given two numbers: "+Div(x,y));
		System.out.println("Remainder of given two numbers: "+Mod(x,y));

	}

}
