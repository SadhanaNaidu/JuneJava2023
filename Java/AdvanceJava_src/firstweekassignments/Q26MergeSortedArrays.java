package firstweekassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q26MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A1 = new int[10];
		
		Scanner S = new Scanner(System.in);
		Integer[] A1 = new Integer[10];// declaring length as 10
		//int len = A1.length;
		System.out.println("Enter the size of array: ");
		int n = S.nextInt();
		System.out.println("Enter the values of array: ");
		for (int i=0; i<n; i++)
		{
			
			A1[i]=S.nextInt();
			//n--;
		}
		 //int A1[] = {1,2,4,6,9,10,0,0,0,0}; //storing first 6 values with numbers and rest as 0
		int A2[] = {3,5,7,8};
		// len = A1.length + A2.length ;
		for(int i=0; i<A2.length; i++)
		{
			A1[i+6] = A2[i]; //inserting A2 values to A1 from i+6=0+6th position, o's in A1 will be replaced with A2 values 
		}
		Arrays.sort(A1);//sorting the new merged array
		System.out.println("Merged array: ");
		for(int S1: A1)
		{
			System.out.print(S1);
		}
		/*for (int j=0; j<A1.length; j++)
		{
			System.out.println(A1[j]);
			
		}*/
S.close();
	}

}
