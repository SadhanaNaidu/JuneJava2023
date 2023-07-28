package April10th;
import java.util.*;

public class DifferentUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Scanner User1 = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int X = User1.nextInt(); //reading int value
		System.out.println("User given number is: "+X);
		
		Scanner User2 = new Scanner(System.in);
		System.out.println("\nEnter any decimal number: ");
		float Y = User1.nextFloat();
		System.out.println("User given float number: " +Y);
		
		float Sum =  (X+Y);
		float Product = X*Y;
		
		
		System.out.println("\nSum of given numbers: " +Sum);
		System.out.println("Product of given numbers: " +Product);
		
		Scanner User3 = new Scanner(System.in);
		System.out.println("\nAre you Robot, Enter True or False: ");
		boolean Z = User3.nextBoolean(); //reading Boolean value
		System.out.println("User given Answer is: "+Z);
		
		User1.close();
		User2.close();
		User3.close();
		
*/
		
		Scanner Age = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int X = Age.nextInt();
		
		Scanner Gender = new Scanner(System.in);
		System.out.println("Enter your Gender: ");
		String gender = Gender.nextLine();
		//String gender1 = gender.toUpperCase();
		//String gender3 = gender1.substring(1, 3);
		
		//CharSequence gender2 = gender1.subSequence(1, 3);
				
				
		Scanner Address = new Scanner(System.in);
		System.out.println("Enter your address: ");
		String address = Address.nextLine();
		String[] str = address.split("d");
		
		
		System.out.println("\nUser details: " );
		System.out.println("Age: " +X);
		System.out.println("Gender: " +gender);
		System.out.println("Address: " +address);
		for(String s: str) System.out.println(s);
		
		//System.out.println("Gender: " +gender2);
		//System.out.println("Gender: " +gender3);
		
		Age.close();
		Gender.close();
		Address.close();
	}

}
