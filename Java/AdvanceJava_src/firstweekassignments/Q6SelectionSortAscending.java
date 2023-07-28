package firstweekassignments;

import java.util.Scanner;

public class Q6SelectionSortAscending {
	
	public static void Ascending(int X[])
	{
		int a;
		int b;
		
		for (int i=0; i<X.length; i++)
		{
			a = i;
			for (int j=i+1; j<X.length; j++)
			{
				if (X[i]>X[j])
				{
					a=j;
				}
				b = X[a];
				X[a] = X[i];
				X[i] = b;
				
			}
		}
		
		for (int j=0; j<X.length; j++) // to display the sorted arrray
		{
			System.out.println(X[j]);
			
		}
		
		
	}
	////////////
	public static void Descending(int X[])
	{
		int a;
		int b;
		
		for (int i=0; i<X.length; i++)
		{
			a = i;
			for (int j=i+1; j<X.length; j++)
			{
				if (X[i]>X[j])
				{
					a=i;
				}
				b = X[a];
				X[a] = X[j];
				X[j] = b;
				
			}
		}
		
		for (int j=0; j<X.length; j++) // to display the sorted arrray
		{
			System.out.println(X[j]);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int len = S.nextInt();
		int arr[] = new int[len];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the "+len+"th value:");
			arr[i] = S.nextInt();
			len--;
		}
		
		System.out.println("Array created by you is:");
		for (int j=0; j<arr.length; j++)
		{
			System.out.print(arr[j]+" ");
			
		}
		
		
		System.out.println("Ascending order of given array: ");
		Ascending(arr);
		System.out.println("Descending order of given array: ");
		Descending(arr);
		S.close();
	}

}
