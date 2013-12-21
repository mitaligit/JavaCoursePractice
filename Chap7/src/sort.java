import java.util.*;
public class sort {
	public static void main(String[] args)
	{
		double[] list1 = {12.3, 16.1, 22.2, 14.4};
		test(list1);
	}
	public static void test(double[] list1)
	{
		System.out.println("Testing:" + Arrays.toString(list1));
		boolean  flag= isSorted(list1);
		System.out.println(flag);
	}
	public static boolean isSorted(double[] list)
	{
		for(int i=0; i<(list.length-1); i++)
		{
			if(list[i]<list[i+1])
			{
				
			}
			else
			{
			return false;	
			}
		}
		return true;
	}

}
