import java.util.Arrays;


public class unique {
	public static void main(String[] args)
	{
	int[] list1= {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
	
	test(list1);
}
public static void test(int[] list)
{
	System.out.println("Testing:" + Arrays.toString(list));
	boolean result = isUnique(list);
	System.out.println("num is:" + result);
}
public static boolean isUnique(int[] list)
{
	for(int i=0; i<(list.length-1); i++)
	{
		for(int j=(i+1); j<(list.length-1); j++)
		{
		if (list[i] != list[j])
		{
			continue;
		}
		else if(list[i]==list[j])
		{
			return false;
			
		}
		}
	}
	return true;
}
}