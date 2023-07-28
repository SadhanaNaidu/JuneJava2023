package April10th;

import java.util.Scanner;

public class ClassAverage {
	
	
	
	public static double Average(int x, int y, int z) 
	{
		double Av = (Sum(x, y, z))/3;
		
		return Av;		
		
	}
	
	public static int Sum(int x, int y, int z)
	{
		return (x+y+z);
	}
	
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner X1 = new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int x1 = X1.nextInt();
		
		System.out.println("Enter the Second value: ");
		int y1 = X1.nextInt();
		
		System.out.println("Enter the Third value: ");
		int z1 = X1.nextInt();
		
		System.out.println("Average of given numbers: " +Average(x1, y1, z1));	
		
		X1.close();
		
		
		
	}

}
