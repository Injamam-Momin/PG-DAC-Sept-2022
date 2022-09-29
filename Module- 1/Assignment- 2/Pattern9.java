import java.util.Scanner;
class Pattern9{
	public static void main(String args[]){
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter number");
		//int num = sc.nextInt();
		//int row = 5;
		//int col = 5;
		//int remain = 0;
		for(char i='A';i<='E';i++)
		{
			for(char j='E';j>i;j--)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			/*for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}*/
			 
			System.out.println();
		}	
	}
}
/*
====A
===A B
==A B C
=A B C D
A B C D E
*/