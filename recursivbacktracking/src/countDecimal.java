
public class countDecimal {
	public static void main(String[] args)
	{
		int n = 3;
		String s = "";
		countBinary(s, n);
	}
	public static void countBinary(String s, int n)
	{
		//String s1 = "0";
		//String s2 = "1";
		if(n ==1)
		{
			for(int i= 0; i<=9; i++)
			System.out.println(s + "" + i);
		}
		else
		{
			for( int j =0; j<=9; j++)
			{
			countBinary(s+"" + j, n-1);
			
			//System.out.println("1" + countBinary(n-1));
			}
		}
	}
}
