import java.util.Arrays;


public class collapprog {
	public static void main(String[] args)
	{
	int[] list1= {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
	
	test(list1);
}
public static void test(int[] list1)
{
	System.out.println("Testing:" + Arrays.toString(list1));
	int[] list2 = collapse(list1);
	System.out.println("num is:" + Arrays.toString(list2));
}
public static int[] collapse(int[] list1)
{
	if (list1.length%2==0)
	{
	int[] list2 = new int[list1.length/2];
	
	for(int i=0; i<(list1.length-1); i+=2)
	{
	list2[i/2] = list1[i]+list1[i+1];
	}
	return list2;
	}
	else
	{
		int[] list2 = new int[(list1.length/2)+1];
		for(int i=0; i<list1.length; i+=2)
		{
			if(i!=(list1.length-1))
			{
			list2[i/2]=list1[i]+list1[i+1];
			}
			else
			{
			list2[i/2]=list1[i];
				
			}
		}
		return list2;
	}
	
}

}
