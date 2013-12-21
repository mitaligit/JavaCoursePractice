import java.util.Arrays;


public class mgap {
	public static void main(String[] args)
	{
	int[] list1= {1, 3, 6, 7, 12};
	
	test(list1);
}
public static void test(int[] list)
{
	System.out.println("Testing:" + Arrays.toString(list));
	int result = minGap(list);
	System.out.println("num is:" + result);
}
public static int minGap(int[] list)
{
	if(list.length<=1)
	{
		return 0;
	}
	else
	{
	int diff;
	int i=0;
	int mindiff=list[i+1]-list[i];
	
	for(i=1; i<(list.length-1); i++)
	{
		diff = list[i+1]-list[i];
		if(mindiff>diff)
		{
			mindiff=diff;
		}
	}
	return mindiff;
	}
}
}
