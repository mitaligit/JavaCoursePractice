
public class facto {
public static void main(String[] args)
{
	test(7);
}
public static void test(int n)
{
	System.out.println("result");
	int res = factorial(n);
	System.out.println(res);
}
public static int factorial(int n)
{
	int result;
	if(n == 1 || n == 0)
	{
		return 1;
	}
	else if(n<0)
	{
		throw new IllegalArgumentException();
	}
	else
	{
		result = n * factorial(n-1);
	}
	return result;
}
}
