package April10th;

public class ClassTriangle {
	
	
	int side1=3, side2=4, side3=5;
	
	
	
	public void TAreaperimeter()
	{
		float perimeter = (side1+side2+side3);
		float s = perimeter/2;
				
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area and Perimeter of Triange is: "+area+ " and " +perimeter);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassTriangle CT = new ClassTriangle();
		CT.TAreaperimeter();
		

	}

}
