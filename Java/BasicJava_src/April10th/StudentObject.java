package April10th;

public class StudentObject {
	
	String name = "john";//instance variable
	int roll_no = 2;
	//String Address;
	
	public void printname() 
	{
		System.out.println(name+ " " +roll_no);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StudentObject Stu = new StudentObject();// non parametrized constructor
		
		
		String Name = Stu.name;
		int Roll_no = Stu.roll_no;
		Stu.printname();
		
	}
		

}
