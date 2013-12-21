import java.util.Scanner;


public class factorany {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type number");
		int number = console.nextInt();
		printFactors(number);
	}
	public static void printFactors(int number)
	{
		int num1 =1;
		System.out.print(num1);
		num1++;
		while(num1<=number)
		{
			
			int i=number%num1;
			if(i==0)
			{
				System.out.print("and");
				System.out.print(num1);
				
				num1++;
			}
			
			else
			{
				num1++;
			}
			
			
		}
	}
}
