package firstweekassignments;

import java.util.*;

public class Q4CheckPalindromeIntegerArray {
	
	
	
	static void Palindrome(int X[])
	{
		for (int i=0; i<X.length ; i++) 
		{
			String New = String.valueOf (X[i]);//int value of X(i) is converted to String value
			StringBuilder Reverse = new StringBuilder();// builds object of StringBuilder
			Reverse.append(New); // stores the value of New in the SringBuilder object "Reverse" using append(New)
			Reverse.reverse(); // reverses the stored value of New
			if ((Reverse.toString()).equals(New) )
				// toString() converts or considers int value of Reverse as string and compares String value store in New
			{
				System.out.println(X[i]+" is Palindrome number: "+Reverse);
			}
			else
			{
				System.out.println(X[i]+" is not Palindrome number: "+Reverse);
			}
			
		}
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int len = S.nextInt();
		int arr[] = new int[len]; 
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the "+len+"th value of an array:");
			arr[i] = S.nextInt();
			len--;
		}		
		System.out.println("Array created by you is:");
		for (int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
			
		}
		Palindrome(arr);
		S.close();

	}

}
