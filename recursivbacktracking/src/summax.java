import java.util.*;
public class summax {
public static void main(String[] args)
{
	int sum =0;
	int[] a = {30, 15, 20};
	ArrayList<Integer> l = new ArrayList<Integer>();
	for(int num: a)
	{
		l.add(num);
	}
	int n = 40;
	
		int result = maxSum(n, l, sum);
	
		System.out.println(result);
		
		
	
	
}
public static int maxSum(int n, ArrayList<Integer> l, int sum)
{
	int great = sum;
	
	if(n == 0)
	{
		//return true;
		return sum;
	}
	else if(l == null)
	{
		return great;
	}
	else
		{
		
		for(int i = 0; i<l.size(); i++)
		{
			int num = l.get(i);
			sum +=num;
			l.remove(i);
			if(n-num>=0)
			{
			int res = maxSum(n-num, l, sum);
				if(great<res)
				{
					great = res;
				}
			}
			l.add(i, num);
			sum = sum-num;
			
			
		}
		return great;
		}
	
}
}
