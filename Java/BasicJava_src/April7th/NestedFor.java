package April7th;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int j=-1; j<=-4; j--)
		{
			for (int i=-1; i<=j; i--)
			{
				System.out.print("*");
			}
			System.out.println();
		} */
		
		
		for (int j=1; j<=4; j++)
		{
			for (int i=1; i<=j; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=i; j--) // print * in 5 4 3 2 1 order
			{
				System.out.print("*");

			}
			System.out.println();
		}

	}

}


/*for (int j=1; j<=i; j++) // print * in 1 2 3 4 5 order
{
	System.out.print("*");

}
System.out.println();    */