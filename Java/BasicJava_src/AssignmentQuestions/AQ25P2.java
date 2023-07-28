package AssignmentQuestions;

public class AQ25P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int j=1;
		//int i=1;
		for(int i=1; i<=n; i++)
			{
				do
					{
						System.out.print(+i); //prints i value repeatedly in same row
						j++;
					}
					while (j<=n);
					System.out.println();
					j = 1; // j is re initiated to 1 so do can be executed again
			}
				
	}

}
