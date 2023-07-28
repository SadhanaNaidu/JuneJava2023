package AssignmentQuestions;
import java.util.*;


public class CharFreqString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int f = 0;

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String Name = S.next();
		char array[] = Name.toCharArray(); //converts the given string into character arrayy with same String length
		for(i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Character to Search: ");
		char C = S.next().charAt(0);
		
		for ( i=0; i<array.length; i++)
		{
			if(array[i] == C)
			{
				f=f+1;
			}
		}
		System.out.println("Frequesncy of "+C+" in the name "+Name+" is: "+f);
	}

}
