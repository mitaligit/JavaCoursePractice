import java.util.Arrays;


public class stringconnew {
	public static void main(String[] args)
	{
	int[] list1= {1, 6, 2, 1, 4, 1, 2, 1, 8};
	int[] list2= {1,4,1};
	
	test(list1, list2);
}
public static void test(int[] list1, int[] list2)
{
	System.out.println("Testing:" + Arrays.toString(list1));
	System.out.println("Testing:" + Arrays.toString(list2));
	boolean result = contains(list1, list2);
	System.out.println("num is:" + result);
}
public static boolean contains(int[] list1, int[] list2)
{
	int j = 0;
	int len = list2.length;
	for(int i=0; i<(list1.length-2); i++)
	{
		int k = i;
		for(j = 0; j<len; j++)
		{
			if(list1[k] == list2[j])
			{
				k++;
			}
			else
			{
				break;
			}
		}
		if(j==len)
		{
			return true;
		}
	}
	
		return false;
}
}
