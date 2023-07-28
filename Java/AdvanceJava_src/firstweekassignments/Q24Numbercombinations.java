package firstweekassignments;

import java.util.*;

public class Q24Numbercombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int N = S.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			int sum = 0;
			int n = i;
			String Str = "";
			do
			{
				sum += n;
				Str =Str+n+"+";//for saving the successive addition string for displaying purpose
				n++;
			}while(sum<N);
			if(sum == N)
			{
				System.out.println(Str);
			}
			
		}
		
		S.close();

	}

}
