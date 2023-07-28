package firstweekassignments; // merge two different sorted arrays, one having more buffer length to insert other arry value

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Q32MergeSortArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A1 = new int[10];
		
		Scanner S = new Scanner(System.in);
		
		//int len = A1.length;
		System.out.println("Enter the size of first array: ");
		int n = S.nextInt();
		Integer[] A1 = new Integer[n];// declaring length as 10
		System.out.println("Enter the values of array: ");
		for (int i=0; i<n; i++)
		{
			
			A1[i]=S.nextInt();
			
		}
				
		for(int i = 0 ; i < n; i++) // swapping for sorting
		{
			
		    for(int j = i + 1; j < n; j++)
		    {
		    	
		    	if (A1[i] > A1[j]) //swap if i >j
		    	{

	                int temp = A1[j];
	                A1[j] = A1[i];
	                A1[i] = temp;
	            }
		    }
		}
		System.out.println("Sorted First array: ");
		
		for(int S1: A1) //display sorted aray
		{
			System.out.print(S1+"\t");
		}
		
		ArrayList<Integer> al = new ArrayList ();
		System.out.println("\nEnter the size of second array: ");
		int n1 = S.nextInt();
		System.out.println("Enter the values of array: ");
		for (int i=0; i<n1; i++)
		{
			
			al.add(S.nextInt());
			
		}
		System.out.println("Sorted second array: ");
		for(int i = 0 ; i < n1; i++)
		{
			
		    for(int j = i + 1; j < n1; j++)
		    {
		    	
		    	if (al.get(i) > al.get(j)) //swap if i >j
		    	{

	                int temp = al.get(j);
	                al.set(j, al.get(i)); //i value is set to jth palce
	                al.set(i, temp); // temp is placed in ith place
	            }
		    }
		}
		
		for(Iterator i = al.iterator(); i.hasNext();) // to display sorted arraylist
		{
			System.out.print(i.next()+"\t");
		}
		
		for(int i=0; i<A1.length; i++)
		{
			al.add(A1[i]); //inserting A1 values to al 
		}
		
		
		
		
		int temp;
		int len = al.size();
		for(int i = 0 ; i < len; i++) // sorting again after merging
		{
			
		    for(int j = i + 1; j < len; j++)
		    {
		    	
		    	if (al.get(i) > al.get(j)) //swap if i >j
		    	{

	                temp = al.get(j);
	                al.set(j, al.get(i)); //i value is set to jth palce
	                al.set(i, temp); // temp is placed in ith place
	            }
		    }
		}
		
		
		System.out.println("\n Array elements after merging from First --> Second: ");
		for(Iterator i = al.iterator(); i.hasNext();) //display final merged sorted arraylist
		{
			System.out.print(i.next()+"\t");
		}

}
}
