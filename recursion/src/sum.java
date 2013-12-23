
/*Write a method sumTo that accepts an integer parameter n and returns the sum of the first n reciprocals. In other words:

sumTo(n) returns: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

For example, the call of sumTo(2) should return 1.5. The method should return 0.0 if passed the value 0 and should throw an IllegalArgumentException if passed a value less than 0.*/

public class sum {
	public static void main(String[] args)
	{
		test(3);
	}
	public static void test(int n)
	{
		System.out.println("result");
		double res = sumTo(n);
		System.out.println(res);
	}
	public static double sumTo(int n)
	{
		//int result;
		if(n == 1)
		{
			return 1.0;
		}
		else if(n<0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			return (1.0/n) + sumTo(n-1);
		}
	
	}
}


