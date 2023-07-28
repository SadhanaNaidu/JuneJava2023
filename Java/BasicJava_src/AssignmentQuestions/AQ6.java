package AssignmentQuestions;
import java.util.*;

public class AQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner B = new Scanner(System.in);
		System.out.println("Enter the Binary value: ");
		int num = B.nextInt();
		System.out.println("Decimal value:");
		int ary[] = new int[10];
		for (int i=0; num>0; i++) // stores remainders in array
		{
			ary[i] = num%2;
			num = num/2;
			//int l= ary[i].length; //property returns array ary's length
			for (int j=i-1; j>=0; j--) // prints array ary in reverse order
			{
				System.out.print(ary[j]);
			}
		}
		
		
		//System.out.println("Modulo array: "+ary[i]);
	}

}
