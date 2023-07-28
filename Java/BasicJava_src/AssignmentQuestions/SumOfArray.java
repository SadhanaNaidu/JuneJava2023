package AssignmentQuestions;
import java.util.*; //


public class SumOfArray {
	
	
	public static void SearchEven(int X[]) // searches for even number in the arry passed
	{
		System.out.println("Even numbers in the created array:");
		for (int i=0; i<X.length; i++)
		{
			if (X[i]%2 == 0)
			{
				System.out.println(+X[i]);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Define the length: ");
		int l = S.nextInt();
		int array[] = new int[l];
		//int[] evenarray = new int [l];
		int Sum = 0;
		
		for (int i=0; i<array.length ; i++)
		{
			System.out.println("Enter the "+l+"th number of array");
			int a = S.nextInt();			
			array[i] = a;
			//evenarray[l] = array[i];
			l--;
			
		}
		System.out.println("Created array is:");
		for(int j=0; j<array.length; j++)
		{
			System.out.println(+array[j]);
			Sum = Sum + array[j];
		}
		System.out.println("Sum of all array numbers:"+Sum);
		SearchEven(array);
		
		S.close();
		
		
	}

}
