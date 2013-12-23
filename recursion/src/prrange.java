
public class prrange {
public static void main(String[] args)
{
	printRange(13, 14);
}
public static void printRange(int n, int m)
{
	if(n==m)
	{
		System.out.print(n);
	}
	else if(m-n == 1)
	{
		System.out.print(n + "-" + m);
	}
	else
	{
		System.out.print(n + ">");
		printRange((n+1), (m-1));
		System.out.print("<" + m);
	}
}
}
