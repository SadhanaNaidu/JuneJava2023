package April6th;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=5, c=7;
		if (c>=b) //& c<=a); Using NestedIf
		{
			if (c>=a)
			{
				System.out.println(+c+" c is the largest");
			}
			else
			{
				System.out.println(+a +" a is the largest");
			}
		}
		else
		{
			if (b>=a)
			{
				System.out.println(+b +" b is the largest");
			}
			else
			{
				System.out.println(+a +" a is the largest");
			}
				
		}

	}

}


