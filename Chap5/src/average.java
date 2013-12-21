import java.util.*;
public class average {
	public static void main(String[] args)
	{
		Scanner console= new Scanner(System.in);
		int number = 37377373;
		int sum = 0;
		int avg = 0;
		int count=0;
		System.out.println("Type a number");
		number = console.nextInt();
		while(number>=0)
		{
			count++;
			sum= sum+number;
			System.out.println("Type a number");
			number = console.nextInt();
			
			
			
		} 
		avg = sum/count;
		System.out.println(avg);
	}
}
