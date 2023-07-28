package April6th;

public class ClassObjectCircle {
	
	int rad=5;
	float pi=3.14f;
	float area, perimeter;
	
	public void Circlearea()
	{
		area = (rad*rad)*pi;
	}
	
	public void Circleperimeter()
	{
		perimeter = 2*rad*pi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassObjectCircle coc = new ClassObjectCircle();
		coc.rad =3;
		coc.pi = 3.13f;
		coc.Circlearea();
		coc.Circleperimeter();
		System.out.println("Area of circle:" +coc.area);
		System.out.println("Perimeter of circle:" +coc.perimeter);
		
	}

}
