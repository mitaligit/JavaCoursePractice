import java.util.Arrays;


public class parcels {
	public static void main(String[] args)
	{
	int[] list1= {500, 300, 241, 99, 501};
	int price = 250;
	
	test(list1, price);
}
public static void test(int[] list, int price)
{
	System.out.println("Testing:" + Arrays.toString(list));
	int result = priceIsRight(list, price);
	System.out.println("num is:" + result);
}
public static int priceIsRight(int[] list, int price)
{
	Arrays.sort(list);
	System.out.println("Testing:" + Arrays.toString(list));
	int num=-1;
	for(int i=(list.length-1); i>=0; i--)
	{
		if(list[i]>price)
		{
			continue;
		}
		else if(list[i]<price)
		{
			num = list[i];
			break;
		}
		
	}
	return num;
}

}
