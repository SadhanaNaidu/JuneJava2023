package firstweekassignments;


import java.util.*;

public class Q60ReverseInt {
	public static void reverseprint(int[] c2, int c)
	{
		int[] S1 = new int[c];
		for(int i=0; i<c;i++)
		{
			S1[i] = c2[i];
			
			System.out.println(S1[i]);
		}
		/*ArrayList<Integer> al = new ArrayList();
		for(int i=0; i<S1.length; i++)
		{
			al.add(S1[i]);
		}
		Collections.reverse(al);
		for(Iterator i = al.iterator(); i.hasNext();) // to display sorted arraylist
		{
			System.out.print(i.next()+"\t");
		}*/
		
		Stack <Integer> stk = new Stack<Integer>();
		for(int i=0; i<S1.length; i++)
		{
			stk.add(S1[i]);
		}
		for(int i=0; i<S1.length; i++) // to display sorted arraylist
		{
			System.out.print(stk.pop()+"\t");
		}
	}
	
	public static void split(int[] b1, int b)
	{
		int end=b;
		do
		{
			int start=0;
			int[] arr = Arrays.copyOfRange(b1, start, end); 
			reverseprint(arr, end);
			//start=end-1;
			end=end+end;
		}while(end<=b1.length);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.print("Give the index to split: ");
		int a = S.nextInt();
		int[] a1 = {3, 2, 4, 7, 0, 3, 1, 5, 8, 4};
		split(a1,a);
		S.close();
	}

}
