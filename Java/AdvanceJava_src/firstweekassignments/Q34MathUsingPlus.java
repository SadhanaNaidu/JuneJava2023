package firstweekassignments;

import java.util.*;

public class Q34MathUsingPlus {

	
	public static double Math(int a, int b, char c)
	{
		double res=0;
		/*
		 * if(c== '+') { res = a+b; } else if(c=='-') { if(a>b) { res = b; while(b<=a) {
		 * b++; res = res + 1; } } else if(b>a) { res = a; while(a<=b) { a++; res =
		 * res+1; } } } return res;
		 */
		
		switch(c)
		{
		case '+':
			res = a+b; break;
			
		case '-':
			if(a>b)
			{	/* * for (int count = b; count <a; count++) { res = res+1; }break;*/
				int count = b;
				do 
				{ 
					res = res+1; count++;
				}while(count<a);
				
			}else if(b>a)
			{
				int count = a;
				do 
				{
					res = res+1; count++;
				}while(count<b);
			}break;
			
		case '*': res = a; 
			do
			{
				res = res + a; b--;
			}while (b>1);break;
			
		case '/': 
			if(a>b)
			{
				int count = b;
				do
				{
					res = res+1;count = count+b;
				}while(count<=a);
			}
			else if(b>a)
			{
				int count = a;
				do
				{
					res = res+1;count = count+a;
				}while(count<=b);break;
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("A value: ");
		int i = S.nextInt();
		System.out.println("B value: ");
		int j = S.nextInt();
		System.out.println("Select +, -, *, / to perform: ");
		char s = S.next().charAt(0);
		double  res = Math(i, j, s);
		System.out.println(s+" of "+i+" and "+j+" is: "+res);
		S.close();
		
		
	}

}
