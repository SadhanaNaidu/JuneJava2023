package April6th;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 10;
		int second = 20;
		int third = 0;
		System.out.printf("Before Swaping first number = "+ first );
		System.out.printf("\nBefore Swaping second number = "+ second);
		System.out.printf("\nBefore Swaping third number = "+ third);
		third = first;
		first = second;
		second = third;
		System.out.printf("\n\nAfter Swaping first number = "+ first );
		System.out.printf("\nAfter Swaping second number = "+ second);
		System.out.printf("\nAfter Swaping third number = "+ third);
		

	}

}
