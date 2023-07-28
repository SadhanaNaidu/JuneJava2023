package Aprill11th;

import java.util.*;

public class SortArray {
	
	
	public static int Searcharray(int a[], int y)//searches y in a array
	{
		for (int i=0; i<a.length; i++)
		{
			if (a[i] == y)
			{
				return i;
			}
		}
		return -1;
				
	}
	
	public static boolean Search(int a[], int y) //returns true if present or false
	{
		for (int i=0; i<a.length; i++)
		{
			if (a[i] == y)
			{
				return true;
			}
		}
		return false;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {2,5,1,4,7,3};
		char b[] = {'a','h','b','e','d','c'};
		for (int i=0; i<6; i++)
		{
			System.out.println(x[i]+"\t " /*+b[i]*/);
		}
		
		Scanner X  = new Scanner(System.in);
		System.out.println("Enter the number to be searched: ");
		int y = X.nextInt();		
		
		System.out.println("At Position: "+Searcharray(x, y));
		//System.out.println(Search(x,y));
		X.close();
	}

}
