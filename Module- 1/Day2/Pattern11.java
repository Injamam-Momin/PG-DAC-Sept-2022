import java.util.Scanner;
class Pattern11{
	public static void main(String args[]){
		
	/* 	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		int row = 5;
		int col = 5;
		int remain = 0; */
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			} 
			for(int j=i;j<=5;j++)
			{
				System.out.print("*");
			} 
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			} 
			System.out.println();
		}	
	}
}
/* 
    **
   **
  ***
 ****
***** 

*/
