package Sorting;

//import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Scanner S = new Scanner(System.in);
		 * System.out.println("Enter the length of array: "); int len = S.nextInt();
		 * int[] I = new int[len]; System.out.println("Enter the elements of array:");
		 * for(int i=0; i<I.length; i++) { I[i] = S.nextInt(); } S.close();
		 */
		 
		int[] I = {5,4,1,3,0,8,7};
		
		for(int i=1; i<I.length; i++)
		{
			int comp = I[i];
			int j=i-1; 
			while(j>=0 && I[j]>comp)
			{
				I[j+1] = I[j]; 
				j=j-1;
				
			}I[j+1] = comp;
			
		}
		System.out.println("Insertion Sorted array: ");
		for(int i=0; i<I.length; i++)
		{
			System.out.print(I[i]+"\t");
		}

	}

}
