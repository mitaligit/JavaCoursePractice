
public class climbladder {
public static void main(String args[])
{
	int n = 4;
	String s = "";
	waysToClimb(n, s);
}
public static void waysToClimb(int n, String s)
{
	if(n == 1)
	{
		System.out.println(s + "1");
	}
	else if (n==2)
	{
		System.out.println(s + "1" + "1");
		System.out.println(s + "2");
	}
	else
	{
		 waysToClimb(n-1, s+ "1" );
		 waysToClimb(n-2, s+ "2" );
	}
}
}
