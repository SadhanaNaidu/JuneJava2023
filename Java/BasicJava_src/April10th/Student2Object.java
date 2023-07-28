package April10th;

public class Student2Object {
	
	String name;
	int roll_no;
	String phone; //decraled as string since int doesnt support and long takes more memory
	String address;
	
	
	public Student2Object(String Name, String Phone, String Address)// local variables inside method
	{
		name = Name;
		phone = Phone;
		address = Address;
	}
	
	public void Print()
	{
		System.out.println(name+" "+phone+" "+address);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2Object Student1 = new Student2Object("Sam\t","Phone1\t","Address1");// constructor using parameters
		Student2Object Student2 = new Student2Object("John\t","Phone2\t","Address2");
		System.out.println("Student information:\n");
		Student1.Print();
		Student2.Print();	
		

	}

}
