package day4;

final public class CheckFinalOnSubclass extends CheckFinalOnParentclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckFinalOnSubclass class1 = new CheckFinalOnSubclass();
		class1.add(1, 2);
	}
	
	public void add (int a, int b)
	{
		int sum = a + b + 10;
		System.out.println("Sum of Integers is:"+sum);
	}
	
	public void add (double a, double b)
	{
		double sum = a + b + 2;
		System.out.println("Sum of Double is:"+sum);
	}

}
