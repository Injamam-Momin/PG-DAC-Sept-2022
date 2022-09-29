import java.util.Scanner;
class Pattern10{
	public static void main(String args[]){
		
	/* 	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		int row = 5;
		int col = 5;
		int remain = 0; */
		for(char i='E';i>='A';i--)
		{
			for(char j='A';j<i;j++)
			{
				System.out.print(" ");
			} 
			for(char j=i;j<='E';j++)
			{
				System.out.print(j+" ");
			}
				 
			System.out.println();
		}	
	}
}
