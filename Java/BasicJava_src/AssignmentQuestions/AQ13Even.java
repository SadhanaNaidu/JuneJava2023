package AssignmentQuestions;

import java.util.*;

public class AQ13Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc = new Scanner(System.in);
		System.out.println("Number: ");
		int n = Sc.nextInt();
		int i = 1;
		int sum = 2;
		do
		{
			System.out.println(+sum);
			sum = sum+2;
			i++;
		}while(i<=n);
	}

}
