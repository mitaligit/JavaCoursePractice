import java.util.*;
public class lastindex {
public static void main(String[] args)
{
	int[] list1 = {74, 85, 102, 99, 101, 85, 56};
	int num = 85;
	test(list1, num);
	
	
}

public static void test(int[] list1, int num)
{
	System.out.println("Testing" + Arrays.toString(list1));
	//System.out.println("result" + Arrays.toString(lastIndexOf(list1)));
	int result = lastIndexOf(list1, num);
	System.out.println(result);
}
public static int lastIndexOf(int[] list1, int num)
{
	int i;
	for(i= (list1.length - 1); i>=0; i--)
	{
		if (list1[i] == num)
		{
			break;
		}
	}
	return i;
}
}
