import java.util.Arrays;


public class kelement {
	public static void main(String[] args)
	{
		int[] list1= {74, 85, 102, 99, 101, 56, 84};
		int k =0;
		test(list1, k);
	}
	public static void test(int[] list, int k)
	{
		System.out.println("Testing:" + Arrays.toString(list));
		int result = kthLargest(list, k);
		System.out.println("num is:" + result);
	}
	public static int kthLargest(int[] list, int k)
	{
			Arrays.sort(list);
			System.out.println(Arrays.toString(list));
			int num= list[(list.length-k-1)];
			return num;
			
	}
}
