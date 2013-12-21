import java.util.Scanner;


public class binarywithbuilder {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type number");
		int num = console.nextInt();
		
		toBinary(num);
	}
	public static void toBinary(int num)
	{
		int rem;
		
		StringBuilder str = new StringBuilder();
		while(num>=1)
		{
			rem=num%2;
			num=num/2;
			str = str.append(rem);
		}
		str.reverse();
		System.out.print(str);
	}

}
