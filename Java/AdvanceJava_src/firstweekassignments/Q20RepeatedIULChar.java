package firstweekassignments;

import java.util.Scanner;

public class Q20RepeatedIULChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int UC = 0;
		int LC = 0;
		int Int = 0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		//char C [] = Str.toCharArray();
		
		int[] Intarray = new int[10];
		int[] Upper = new int [26];
		int[] Lower = new int[26];
		for(int i=0; i<Str.length(); i++)
		{
			//int UC = 1;
			//int LC = 1;
			//int Int = 1;
			char C = Str.charAt(i); //reading every character from the string given
					
			if(C >= 'A' && C <= 'Z')
			{
				UC += 1;
				Upper[C - 'A']++; 
			}
			else if (C >= 'a' && C <= 'z')
			{
				LC += 1;
				Lower[C - 'a']++;
			}
			else if (C >= '0' && C <= '9')
			{
				Int += 1;
				Intarray[C - '0']++;
			}		
		}
		
		System.out.println("No of Upper Case letters: "+UC);
		System.out.println("No of Lower Case letters: "+LC);
		System.out.println("No of Integers found: "+Int);
		
		System.out.println("Repeated characters: : ");
		for(int i=0; i<10; i++)// <10 for 0-9 integers
		{
			if(Intarray[i] >1)
			{
				System.out.println(i+" repeated: "+Intarray[i]);
			}
		}
		
		for(int i=0; i<26; i++) //<26 no.of alphabets
		{
			if(Upper[i] >1)
			{
				System.out.println((char)('A' +i)+" repeated: "+Upper[i]);//converts i(ASCII code) to its upper case alphabet
			}
		}
		for(int i=0; i<26; i++)
		{
			if(Lower[i] >1)
			{
				System.out.println((char)('a' +i)+" repeated: "+Lower[i]); //converts i(ASCII code) to its lower case alphabet
			}
		}
		
		S.close();

	}

}
