

/*Write a method writeSquares that accepts an integer parameter n and prints the first n squares separated by commas, with the odd squares in descending order followed by the even squares in ascending order. The following table shows several calls to the method and their expected output:
Call 	Valued Returned
writeSquares(5); 	25, 9, 1, 4, 16
writeSquares(1); 	1
writeSquares(8); 	49, 25, 9, 1, 4, 16, 36, 64

Your method should throw an IllegalArgumentException if passed a value less than 1. Note that the output does not advance onto the next line.*/

public class squar {
	public static void main(String[] args)
	{
		test(80);
	}
	public static void test(int n)
	{
		System.out.println("result");
		printTwos(n);
		
	}
	public static void printTwos(int n)
	{
		//int result;
		if(n == 1)
		{
			System.out.print(1);
		}
		else if(n%2!=0)
		{
			System.out.print(n);
		}
		else if(n<=0)
		{
			throw new IllegalArgumentException();
		}
		else if(n%4==0)
		{
			System.out.print("2*");
			printTwos(n/4);
			System.out.print("*2");
		}
		else if(n%2==0)
		{
			System.out.print("2*");
			printTwos(n/2);
			
		}
		
	
	}
}
