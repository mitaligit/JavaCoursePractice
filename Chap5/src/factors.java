import java.util.Scanner;


public class factors {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type number");
		int number = console.nextInt();
		showTwos(number);
	}
	
	public static void showTwos(int number)
	{
		while(number%2==0)
		{
			System.out.print("2*");
			number = number/2;
			
		}
		System.out.print(number);
	}

}
