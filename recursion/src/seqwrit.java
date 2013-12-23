
public class seqwrit {
public static void main(String[] args)
{
	writeSequence(8);
}
public static void writeSequence(int num)
{
	if(num ==1)
	{
		System.out.print("1");
	}
	else if(num ==2)
	{
		System.out.print("1" + "1");
		
	}
	else
	{
		System.out.print((num+1)/2);
		writeSequence(num-2);
		System.out.print((num+1)/2);
	}
}
}
