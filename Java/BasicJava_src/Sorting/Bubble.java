package Sorting;//Bubble: comparing first element with second, second with third, third with fourth

import java.util.*;


public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int len = S.nextInt();
		int[] I = new int[len];
		System.out.println("Enter the array elements:");
		for(int i=0; i<len; i++)
		{
			I[i] = S.nextInt();
		}
		
		int temp;
		for(int i=0; i<I.length; i++)
		{
			for(int j=0; j<I.length-1; j++)
			{
			if(I[j] > I[j+1])
			{
				temp = I[j];
				I[j] = I[j+1];
				I[j+1] = temp;
			}
			
		}
		}
		System.out.println("Bubble Sorted Array:");
		for(int j=0; j<I.length; j++)
		{
			System.out.print(I[j]+"\t");
		}
		
		S.close();
				
	}

}
