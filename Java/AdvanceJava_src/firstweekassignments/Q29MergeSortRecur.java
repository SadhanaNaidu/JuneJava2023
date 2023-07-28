package firstweekassignments; // merge sort using recursion////INCOMPLETE

import java.util.Arrays;
import java.util.Scanner;///////INCOMPLETE

public class Q29MergeSortRecur {
	
	
	public static int[] Merge(int a2[], int a3[])
	{
		int[] finalarray = new int[a2.length+a3.length];
		int a2left = 0;//setting start position to 0 for left array
		int a3right = 0;//setting start position to 0 for right array
		int finalindex = 0;//setting start position to 0 for final array
		while ((a2left<a2.length) && (a3right<a3.length))
		{
			
			if(a2[a2left]<a3[a3right]) //value of left < value of right is true
			{
				finalarray[finalindex] = a2[a2left]; //final get left value
				a2left++; //increment lft
				finalindex++;
			}
			else //value of left < value of right is false
			{
				finalarray[finalindex] = a3[a3right]; //final get right value
				a3right++;////increment right
				finalindex++;
			}
			//finalindex++; // in any case increment final index
		}
		while(a2left<a2.length) //checking if more numbers in left array after 1st while loop execution
		{
			finalarray[finalindex] = a2[a2left]; // inserting leftover elements into final array
			a2left++;
			finalindex++;
		}
		while(a3right<a3.length) //checking if more numbers in right array after 1st while loop execution
		{
			finalarray[finalindex] = a3[a3right];  // inserting leftover elements into final array
			a3right++;
			finalindex++;
		}
		
		return finalarray;
	}
	
	public static int[] MSort(int a1[])
	{
		
		if (a1.length<=1)
			return a1;
		else 
		{
		int m = (0+(a1.length-1))/2; //finding midvalue
		int[] Larray = MSort(Arrays.copyOfRange(a1, 0, m)); //Arrays.copyofRange returns  array a1 from 0 - m
		int[] Rarray = MSort(Arrays.copyOfRange(a1, m+1,a1.length-1 ));//returns  a1 from m+1 - end(a1.length-1)
		//MSort(Larray);
		//MSort(Rarray);
		return a1 = Merge(Larray, Rarray);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int len = S.nextInt();
		int A1[] = new int[len];
		System.out.println("Enter the array elements: ");
		
		for (int i=0; i<A1.length; i++)
		{
			A1[i] = S.nextInt(); 
			len--;
		}	
		System.out.println("Merge Sort array: ");
		int [] A2 = MSort(A1);
		System.out.println(Arrays.toString(A2));
		
		  for(int i=0; i<A2.length; i++) 
		  { 
			  System.out.print(A2[i]+"\t");
		  
		  }
		 
		 
		S.close();

	}

}
