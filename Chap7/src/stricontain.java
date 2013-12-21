import java.util.Arrays;


public class stricontain {
	public static void main(String[] args)
	{
	int[] list1= {1, 6, 2, 1, 4, 1, 2, 1, 8};
	int[] list2= {1, 2, 1};
	
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
	int j=0;
	for(int i=0; i<(list1.length-2); i++)
	{
		
		if (list1[i]==list2[j])
		{
			if(list1[i+1]==list2[j+1])
			{
				if(list1[i+2]==list2[j+2])
				{
					return true;
				}
				else
				{
					continue;
				}
			}
			else
			{
				continue;
			}
		}
		else
		{
			continue;
		}
	}
	return false;
}
}
