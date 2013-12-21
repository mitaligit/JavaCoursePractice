import java.util.Arrays;


public class sortsequence {
	public static void main(String[] args)
	{
	int[] list1= {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1,2,3,4,5,6,7,8,9, 19};
	
	test(list1);
}
public static void test(int[] list)
{
	System.out.println("Testing:" + Arrays.toString(list));
	int result = longestSortedSequence(list);
	System.out.println("num is:" + result);
}
public static int longestSortedSequence(int[] list)
{
	int count=1;
	int maxcount=1;
	int maxindex = 0;
	int pos = 0;
	for(int i=0; i<(list.length-1); i++)
	{
		if(list[i]<=list[i+1])
		{
			count++;
			if(maxcount<count)
			{
			maxcount=count;
			maxindex = pos;
			
			}
		}
		else if(list[i]>list[i+1])
		{
		
			
			if(maxcount<count)
			{
			maxcount=count;
			maxindex = pos;
			
			}
			
			else
			{
				
			}
			count=1;
			pos = i+1;
		}
	}
	System.out.println(maxcount);
	System.out.println(maxindex);
	return maxcount;
}
}
