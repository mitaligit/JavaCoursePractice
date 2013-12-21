import java.util.Arrays;
public class standev {
	public static void main(String[] args)
	{
		int[] list1= {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		test(list1);
	}
	public static void test(int[] list)
	{
		System.out.println("Testing:" + Arrays.toString(list));
		double result = stdev(list);
		System.out.println("max occuring num is:" + result);
	}
	public static double stdev(int[] list)
	{
		int avg = 0;
		int count =0;
		int sum=0;
		for(int i=0; i<list.length; i++)
		{
		count++;
		sum += list[i];
		}
		avg= sum/count;
		return avg;
	}
}
