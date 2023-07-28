package April10th;

public class ClassRectangle {
	
	float area;
	int length;
	int breadth;
	
	
	public ClassRectangle(int x, int y)
	{
		length = x;
		breadth = y;
		
	}
	
	void Area()
	{
		area = (length*breadth);
		System.out.println("Area of Rectangle:\t" +area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassRectangle Rectangle1 = new ClassRectangle (4,5);
		ClassRectangle Rectangle2 = new ClassRectangle (5,8);
		Rectangle1.Area();
		Rectangle2.Area();
		
	}

}
