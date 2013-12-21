import java.util.Scanner;


public class coomondivisor {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type number1");
		int num1 = console.nextInt();
		Scanner console1 = new Scanner (System.in);
		System.out.println("type number2");
		int num2 = console1.nextInt();
		gcd(num1, num2);
	}
	public static void gcd(int num1, int num2)
	{
		int i =1;
		int gcd = 1;
		while(i<=num1)
		{
		int result1 = num1%i;
		int result2 = num2%i;
		if(result1==0)
		{
			if(result2==0)
			{
			gcd=i;
			}
			i++;
		}
		else
		{
			i++;
		}
		
		}
		System.out.println(gcd);
	}
}
