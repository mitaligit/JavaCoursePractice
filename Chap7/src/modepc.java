import java.util.*;
public class modepc {
public static void main(String[] args)
{
	int[] list1= {27, 15, 15, 11, 27};
	test(list1);
}
public static void test(int[] list)
{
	System.out.println("Testing:" + Arrays.toString(list));
	int result = mode(list);
	System.out.println("max occuring num is:" + result);
}
public static int mode(int[] list)
{
	int i=0;
	int maxcount =0;
	int maxvalue=list[i];
	for(i=0; i<list.length; i++)
	{
		int count =1;
			for(int j=(i+1); j<list.length; j++)
			{
				if(list[i] == list[j])
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				maxvalue=list[i];
			}
			else if(count == maxcount)
			{
				if(maxvalue>list[i])
				{
					maxvalue=list[i];
				}
			}
	}
	System.out.println("countis:" + maxcount);
	return maxvalue;
	
}
}
