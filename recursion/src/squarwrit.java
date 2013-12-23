
public class squarwrit {
public static void main(String[] args)
{
	writeSquares(8);
}
public static void writeSquares(int n)
{
	if(n==1)
	{
		System.out.print(n);
	}
	else if(n%2 == 0)
	{
		writeSquares(n-1);
		System.out.print("," + n*n);
	}
	else
	{
		System.out.print(n*n + ",");
		writeSquares(n-1);
	}
}
}
