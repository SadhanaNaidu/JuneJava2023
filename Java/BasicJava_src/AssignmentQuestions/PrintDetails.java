package AssignmentQuestions;
 import java.util.*;

public class PrintDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String Name = S.next();
		
		System.out.println("Age: ");
		int a = S.nextInt();
		
		System.out.println("Gender: ");
		char g = S.next().charAt(0); //accepts first character
		
		System.out.println("Aadhar No: ");
		String an = S.next();
		 
		System.out.println("\nYour Details:\n" +Name+ "\n" +a+"\n" +g+"\n" +an);
		S.close();
	}

}
