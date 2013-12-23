

/*Write a method multiplyEvens that returns the product of the first n even integers. For example:
Call 	Output 	Reason
multiplyEvens(1); 	2 	2 = 2
multiplyEvens(2); 	8 	2 * 4 = 8
multiplyEvens(3); 	48 	2 * 4 * 6 = 48
multiplyEvens(4); 	384 	2 * 4 * 6 * 8 = 384

You should throw an IllegalArgumentException if passed a value less than or equal to 0.*/

public class multeven {
	public static void main(String[] args)
	{
		test();
	}
	public static void test()
	{
		try { 
			int res1 = multiplyEvens(-1);
			System.out.println(" Test case failed :" + -1 );
		} catch( IllegalArgumentException e) {
			System.out.println(" Test case passed");
		}
		
		int[] n ={1,2,3,4} ;
		int[] expectedop = {2, 8, 48, 384};
		for(int i =0; i<n.length; i++)
		{
		int res = multiplyEvens(n[i]);
		if(res == expectedop[i])
		{
			System.out.println("verified test case passed" +n[i]);
		}
		else
		{
			System.out.println("wrong prog" + n[i]);
		}
		
		}
	}
	public static int multiplyEvens(int n)
	{
		int result;
		if(n == 1)
		{
			return 2;
		}
		else if(n<0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			result = (n*2) * multiplyEvens(n-1);
		}
		return result;
	}
	
}
