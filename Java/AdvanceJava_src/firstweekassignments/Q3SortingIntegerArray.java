package firstweekassignments;

import java.util.*;


public class Q3SortingIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int len = S.nextInt();
		Integer arr[] = new Integer[len]; //Wrapper class Integer is used instead of primitive datatype int in order to perform collections.reverseorder()
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
		
		System.out.println("Array sorted in ascending order:");
		Arrays.sort(arr);//Arrays.sort(arrayname) sort ismethod in Arrays class under util package which sorts array(arr) in ascending order
		for (int j=0; j<arr.length; j++) // to display the sorted arrray
		{
			System.out.println(arr[j]);
			
		}
		
		System.out.println("Array sorted in descending order:");
		Arrays.sort(arr, Collections.reverseOrder()); // reverseorder() is method in Collections class under util package to reverse the ascending order done by sort
		
		for (int j=0; j<arr.length; j++) // to display the sorted arrray
		{
			System.out.println(arr[j]);
			
		}
		S.close();
	}

}
