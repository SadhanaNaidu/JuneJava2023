package AssignmentQuestions;//Swaping 2 numbers without temp

public class AQ21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y = 20;
		System.out.println("Value before Swapping: x="+x+ " and y=" +y);
		x=(x+y);
		y=x-y;
		x=x-y;
		
		System.out.println("Value after Swapping: x="+x+ " and y=" +y);
		

	}

}
