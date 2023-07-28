package Sorting;//Selection sort compares first element to all the elements then swaps, 
											//agian second element compared to all elements and go on

import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int len = S.nextInt();
		int[] I = new int[len];
		System.out.println("Enter the elements of array:");
		for(int i=0; i<I.length; i++)
		{
			I[i] = S.nextInt();
		}//int[] I = {3,7,1,9,4,0,8};
		S.close();
		int temp;
		for(int i=0; i<I.length; i++)
		{
			for(int j=i+1; j<I.length; j++)
			{
				if(I[i]>I[j])
				{
					temp = I[j];
					I[j] = I[i];
					I[i] = temp;
				}
			}
		}
		System.out.println("Selection Sort arry:");
		for(int i=0; i<I.length; i++)
		{
			System.out.println(I[i]);
		}
	}

}
