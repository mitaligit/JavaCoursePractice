import java.util.Arrays;


public class range1 {
	public static void main(String[] args)
	{
		int[] a1 = {8, 3, 5, 7, 2, 4};
		test(a1);	
	}

	public static void test(int[] a1)
	{
		System.out.println("Testing" + Arrays.toString(a1));
		//System.out.println("result" + Arrays.toString(lastIndexOf(list1)));
		int result = range(a1);
		System.out.println(result);
	}
	
	public static int range(int[] a1)
	{
		int small;
		int large;
		int i=0;
		int result;
		small = a1[i];
		large = a1[i];
		for(i = 1; i< a1.length; i++)
		{
			if(a1[i]<= small)
			{
				small = a1[i];
			}
			else if(a1[i]>=large)
			{
				large = a1[i];
			}
		}
		result = (large - small) + 1;
		return result;
		
	}

}
