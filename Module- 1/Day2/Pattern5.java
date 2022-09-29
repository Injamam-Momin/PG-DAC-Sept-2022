import java.util.Scanner;
class Pattern5{
	public static void main(String args[]){
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter number");
		//int num = sc.nextInt();
		//int row = 5;
		//int col = 5;
		//int remain = 0;
		for(char i='A';i<='E';i++)
		{
		
			for(char j='A';j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}	
	}
}


/*num = 1234

   remainder = num%10 = 4
   reverse = remainder
   num = num/10 */