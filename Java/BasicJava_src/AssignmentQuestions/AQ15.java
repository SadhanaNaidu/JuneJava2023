package AssignmentQuestions;//printing age group according to age

import java.util.Scanner;

public class AQ15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = S.nextInt();
				
		//int age = 30;
		int n = age;
		if (n<=2)
		{
			System.out.println("Age group is Toddler");
		}
		else if (n>2 && n<=10)
			{
				System.out.println("Age group is Kid");
							
			}
			else if (n>10 && n<=18)
				{
					System.out.println("Age group is Children");
							
				}
				else if (n>18 && n<=30)
					{
						System.out.println("Age group is Young Adult");
							
					}
					else if (n>30 && n<=45)
						{
							System.out.println("Age group is Adult");
							
						}
						else if (n>45)
							{
								System.out.println("Age group is Old Adult");
							
							}
	S.close();
	}

}



