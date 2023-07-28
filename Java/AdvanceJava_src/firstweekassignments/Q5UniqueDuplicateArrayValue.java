package firstweekassignments;


import java.util.Scanner;

public class Q5UniqueDuplicateArrayValue {
	
	static void Dup(int X[])
	{
		int j,i;
		int occur = 1;
		for( i =0; i<X.length; i++)
		{
			for (j=i+1; j<X.length; j++)
			{
				if (X[i] == X[j])
				{
					occur += 1;
					System.out.println(X[i]+" repeated "+occur+" times."); 
				}
				
				
			}
		}
	}
	
	static void Unique(int X[])
	{
		int i,j ;
		
		for( i =0; i<X.length; i++)
		{
			int occur = 0;
			for (j=0; j<X.length; j++)
			{
				if ((X[i] == X[j]) && (i!=j))
				{
					occur = 1;
					//System.out.println(X[i]+" is unique character"); 
				}
			}
			if (occur == 0)
			{
	            System.out.println(X[i]+" is unique");
			}	
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = S.nextInt();
		int array[] = new int[len];
		for (int i=0; i<array.length; i++)
		{
			System.out.println("Enter the "+len+"th value:");
			array[i] = S.nextInt();
			len--;			
		}
		System.out.println("Created array is:");
		for (int j=0; j<array.length; j++)
		{
			System.out.println(array[j]);
			
		}
		Dup(array);
		Unique(array);
		
		
		S.close();

	}

}
