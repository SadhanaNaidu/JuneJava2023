package firstweekassignments;

import  java.util.*;
public class Q25BinarySearch {
	
	
	public static int binary(Integer[] I, int x)
	{
		int start=0;
		int mid, last=I.length-1;
		do
		{
			mid = (start+last)/2;
			if(I[mid]<x)
			{
				start = mid+1;
			}
			else if(I[mid]>x)
			{
				last = mid - 1;
			}
			else 
			{
				return mid;
			}
			
		}while(start<=last);
		return mid;
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = S.nextInt();
		Integer[] A = new Integer[len];
		System.out.println("Enter the values of array: ");
		for (int i=0; i<A.length; i++)
		{
			
			A[i]=S.nextInt();
			len--;
		}
		System.out.print("Enter the value to be searched: ");
		int N = S.nextInt();
		
		
		/*System.out.println("Values Entered: ");
		for (int i=0; i<A.length; i++)
		{
			
			System.out.println(A[i]);
			
		}*/
		Arrays.sort(A);//sort is a method in Array class for sorting in ascending order
		System.out.println("Number "+N+" is found at index: '"+binary(A,N)+"' in sorted array");
		//binary(A,N);
		System.out.println("Values sorted: ");
		for (int i=0; i<A.length; i++)
		{
			
			System.out.println(A[i]);
		}
		
		S.close();
		
	}

}
