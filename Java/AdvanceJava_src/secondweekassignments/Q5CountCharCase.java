package secondweekassignments;

import java.util.Scanner;

public class Q5CountCharCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int UC = 0;
		int LC = 0;
		int Int = 0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		char C [] = Str.toCharArray();
		for(int i=0; i<C.length; i++)
		{
			if(C[i] >= 'A' && C[i] <= 'Z')
			{
				UC += 1;
			}
			else if (C[i] >= 'a' && C[i] <= 'z')
			{
				LC += 1;
			}
			else if (C[i] >= '0' && C[i] <= '9')
			{
				Int += 1;
			}
		}
		
		System.out.println("No of Upper Case letters: "+UC);
		System.out.println("No of Lower Case letters: "+LC);
		System.out.println("No of Integers found: "+Int);
		S.close();

	}

}
