package firstweekassignments; ///////complete

import java.util.Scanner;

public class Q19OccurallCharString {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str = S.nextLine();
		char[] C = Str.toCharArray();
		
		
		for(int i=0; i<C.length; i++)
		{
			int count = 1;
			
			for(int j=i+1; j<C.length; j++)
				{
					if(C[i] == C[j])
					{
						count += 1;
						//System.out.println( C[i]+" occured "+count+" times"); 
						C[j]=' '; //if char repeats then inserting null to the repeated place 
						
					}//System.out.println( C[i]+" occured "+count+" times"); 
					
				}
			if(count>1 && C[i] != ' ')
			{
				System.out.println( C[i]+" occured "+count+" times");
			}
			else if ( count == 1 && C[i] != ' ')
			{
				System.out.println( C[i]+" occures once");
			}
			
		}
		
		S.close();
	}
}
		//completed, 

	


