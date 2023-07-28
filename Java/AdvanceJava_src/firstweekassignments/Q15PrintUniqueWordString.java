package firstweekassignments;

import java.util.*;

public class Q15PrintUniqueWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String Sent = S.nextLine();
		System.out.println("Your sentence: "+Sent);
		String[] Str1 = Sent.split(" ");
		//String[] Str = new String[20];
		System.out.println("Unique words:");
		
		for(int i=0; i<Str1.length; i++)
		{
			count = 1;
			for(int j=i+1; j<Str1.length; j++) //counter starts from second word
			{
				//int count = 1;
				if(Str1[i].equalsIgnoreCase(Str1[j]))
				{
					count +=1; // increases count by 1 for every repeat
					//Str[i]=Str1[j];
					//System.out.println(Str);
					Str1[j]="null"; //if word repeats then inserting null to the repeated place 
					
				}
			}
			if(count == 1 && Str1[i] != "null")// checking for count=1 and value is null, value is unique
			{
				System.out.println(Str1[i]);
			}
		}
		
		
		
		S.close();

	}

}
