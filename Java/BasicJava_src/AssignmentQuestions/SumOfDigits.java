package AssignmentQuestions;
import java.util.*;




public class SumOfDigits {
	
	public static int SumOf(int n)
	{
		int sum = 0;
		do
		{
			int mod = n%10; //get the remaider
			sum = sum + mod;//sequentially adds the remainder
			n = n/10; //divide to get rid of last digit to continue
		}
		while (n>0);
		return sum;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner I = new Scanner(System.in);
		System.out.println("Number: ");
		int i = I.nextInt();
		System.out.println("Sum of digits in the number: "+SumOf(i));			

	}

}
