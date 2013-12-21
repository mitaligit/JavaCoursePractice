import java.util.Scanner;
import java.util.*;

public class dice {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("Desired dice sum");
		int num = console.nextInt();
		
		diceSum(num);
	}
	public static void diceSum(int num)
	{
		int num1 =0;
		int num2 =0;
		while(num1 + num2 != num)
		{
			Random r1= new Random();
			Random r2= new Random();
			num1 = r1.nextInt(6) + 1;
			num2 = r2.nextInt(6) + 1;
			int sum = num1+num2;
			System.out.println(num1 +"and"+ num2 + "="+sum); 
		}
	}
}
