import java.util.Arrays;


public class percentev {
	public static void main(String[] args)
	{
	int[] list1= {6, 2, 9, 11, 3};
	
	test(list1);
}
public static void test(int[] list)
{
	System.out.println("Testing:" + Arrays.toString(list));
	double result = percentEven(list);
	System.out.println("num is:" + result);
}
public static double percentEven(int[] list)
{
	double evencount=0;
	double percent;
	for(int i=0; i<list.length; i++)
	{
		if(list[i]%2==0)
		{
			evencount++;
		}
	}
	System.out.println(evencount);
	percent = (evencount/list.length)*100;
	return percent;
}
}
