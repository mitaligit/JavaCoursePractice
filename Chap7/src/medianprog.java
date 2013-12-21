import java.util.Arrays;


public class medianprog {
	public static void main(String[] args)
	{
	int[] list1= {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
	
	test(list1);
}
public static void test(int[] list)
{
	System.out.println("Testing:" + Arrays.toString(list));
	int result = median(list);
	System.out.println("num is:" + result);
}
public static int median(int[] list)
{
	Arrays.sort(list);
	System.out.println(Arrays.toString(list));

	int rem = (list.length)/2;
	int med = list[rem];
	return med;
}

}
