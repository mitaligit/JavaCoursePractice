import java.util.*;
public class countinr {
public static void main(String[] args)
{
	int[] list2 = {14, 1, 22, 17, 36, 7, -43, 5};
	int num1 = 4;
	int num2 = 17;
	test(list2, num1, num2);
}
public static void test(int[] list, int num1, int num2)
{
	System.out.println("Testing" + Arrays.toString(list));
	int result = countInRange(list, num1, num2);
	System.out.println(result);
}
public static int countInRange(int[] list, int num1, int num2)
{
	int count = 0;
	for(int i=0; i<list.length; i++)
	{
		if(list[i] >= num1 && list[i]<=num2)
		{
			count++;
		}
	}
	return count;
}
}
