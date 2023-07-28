package April6th;



public class ClassObjectRectangle {
	
	int width;
	int length;
	int area;
	int volume;
	
	public void RectangleArea()
	{
		 area = (width*length);
	}
	
	public void RectangleVolume()
	{
		 volume = (2*(width+length));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassObjectRectangle cbr = new ClassObjectRectangle();
		cbr.width = 10;
		cbr.length = 5;
		cbr.RectangleArea();
		cbr.RectangleVolume();
		System.out.println("Area of Rectangle = "+cbr.area);
		System.out.println("Volume of Rectangle = "+cbr.volume);
		
		

	}

}
