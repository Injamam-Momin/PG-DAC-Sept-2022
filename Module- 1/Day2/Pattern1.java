import java.util.Scanner;
class Test{
	public static void main(String args[]){
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter number");
		//int num = sc.nextInt();
		int row = 5;
		int col = 5;
		int remain = 0;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}	
	}
}


/*num = 1234

   remainder = num%10 = 4
   reverse = remainder
   num = num/10 */