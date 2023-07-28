
package April7th;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = num.nextInt();
		int Pro = 1;
		System.out.println("Value entered is:" +n);
		for(int i=1; i<=10; i++)
		{
			Pro = n * i;
			System.out.println(+n+"*"+i+"="+Pro); 
		}
		

	}

}
