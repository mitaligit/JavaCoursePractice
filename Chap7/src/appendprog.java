import java.util.Arrays;


public class appendprog {
	public static void main(String[] args)
	{
	int[] list1=  {2, 4, 6};
	int[] list2=  {1, 2, 3, 4, 5};
	
	test(list2, list1);
}
public static void test(int[] list2, int[] list1)
{
	System.out.println("Testing:" + Arrays.toString(list1));

	System.out.println("Testing:" + Arrays.toString(list2));
	int[] list3 = append(list1, list2);
	System.out.println("num is:" + Arrays.toString(list3));
}
public static int[] append(int[] list2, int[] list1)
{
	int[] list3 = new int[list1.length+list2.length];
	int currentpos = 0;
	for( int i=0; i<list1.length; i++)
	{
		list3[currentpos]= list1[i];
		currentpos++;
	}
	for( int j=0; j<list2.length; j++)
	{
		list3[currentpos]= list2[j];
		currentpos++;
	}
	return list3;
}
}
