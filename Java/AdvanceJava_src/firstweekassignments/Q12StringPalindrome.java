package firstweekassignments; ////check for number to be done

import java.util.Scanner;

public class Q12StringPalindrome {

	static void Palindrome(String X)
	{
			String New = X;
			StringBuilder Reverse = new StringBuilder();// builds object of StringBuilder
			Reverse.append(New); // stores the value of New in the SringBuilder object "Reverse" using append(New)
			Reverse.reverse(); // reverses the stored value of New
			if ((Reverse.toString()).equals(New) )
				// toString() converts or considers int value of Reverse as string and compares String value store in New
			{
				System.out.println(X+" is Palindrome");
			}
			else
			{
				System.out.println(X+" is not Palindrome");
			}
					
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the word:");
		String len = S.nextLine();
		Palindrome(len);
		S.close();
	}

}
