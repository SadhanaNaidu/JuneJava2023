package AssignmentQuestions;

public class AQ25P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i=1; i<=n; i++) // builds 5 rows
		{
			for (int j=1; j<=5; j++) // prints 12345 in same row
			{
				System.out.print(+j);
			}
			System.out.println();
		}



 
//int n=5;
int j=1;
//int i=1;
System.out.println();
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


//P2


/*P3
int n=4;


//int j=1;
for(int i=1;i<=n;i++)
{
	for (int j=1;j<=i;j++)
	{
		System.out.print("1");
	}
	System.out.println();
}





/*P4

int n=7;
for (int i=1;i<=n;i++)
{
	
	for (int j=1;j<=i;j++)
	{
		if ((i%2)==0) {
		break;}
		System.out.print("1");
		
	}
	
	System.out.println();
} *///P4


/* P5

int n=5;
for (int i=5; i>=0; i--) 
{
	for (int j=1; j<=i; j++) 
	{
		
		System.out.print(+j);
		//if(j==n-i)
			//break;
	}
	System.out.println();
} *///P5