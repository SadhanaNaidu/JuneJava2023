package firstweekassignments;

import java.util.Scanner;

public class Q30LongestPalindrome {
	
	public static String checkpalindrome(String Str)
	{
		
		String Str1 = Str.replaceAll(" ", "");
		int len1 = Str1.length();
		System.out.println("Entered String is :"+Str1);
		int max_len = 0;
		String temp1 = "";
		for(int i=0; i<=len1; i++)
		{
			for(int j=i+1; j<=len1; j++)
			{
				String temp = Str1.substring(i,j);//substring including ith and excluding jth is in temp
				//System.out.println(temp);
				StringBuilder sb = new StringBuilder();//creating SB object to reverse and compare to original string
				sb.append(temp);
				if(sb.reverse().toString().equals(temp) && temp.length()>max_len)//check the length of substring created
				{
					temp1 = temp;
					max_len = temp1.length();//counter updates with lenght of substring
				}
				
				
			}
		}
		return temp1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String len = S.nextLine();
		//System.out.println("Entered String is :"+len);
		S.close();
		String pal = checkpalindrome(len);
		System.out.println("Longest Palindrome: "+pal);
				
	}

}
