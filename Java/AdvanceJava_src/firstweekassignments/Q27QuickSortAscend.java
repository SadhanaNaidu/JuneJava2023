package firstweekassignments;

import java.util.*; // consider first element as pivot(pos),  


public class Q27QuickSortAscend {
	
	
	public static void QSort(int a[], int s, int e)
	{
		if(s>=e)
			return;
		
		int pos = FindPos( a, s, e);
		QSort(a, pos+1, e);
		QSort(a, s, pos-1);
		
	}
	
	public static int FindPos(int a[], int s, int e)
	{
		int pos = a[s];
		int i = s;//0
		int j = e ;//4
		
		while(i<j)
		{
			while(a[i]<=pos) 
			{
				i++;
				
			}
			
			while(a[j]>pos)
			{
				j--;
			}
			
			if(i<j)
			{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		int temp = a[j];
		a[j] = a[s];
		a[s] = temp;
		return j;
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
			A1[i] = S.nextInt(); //5 6 1 9 2 
			len--;
		}	
		System.out.println("Quick Sort array: ");
		QSort(A1, 0, A1.length-1);//assume length is 5 so passing 5-1(4 last position), considering pivot  = first number
		for(int i=0; i<A1.length; i++) 
		{
		  System.out.print(A1[i]+"\t");
		  
		}
		 
		S.close();
	}

}
